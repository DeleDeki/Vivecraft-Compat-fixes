# Vivecraft Compat v3.4.3 - safe local source build and JAR verification.
# This script DOES NOT use Git, modify src/, commit/push, or alter the modpack.
$ErrorActionPreference = 'Stop'

if (-not (Test-Path -LiteralPath '.\gradlew.bat')) {
    throw 'Open PowerShell in the Vivecraft Compat PROJECT ROOT first (the folder containing gradlew.bat).'
}
if (-not (Test-Path -LiteralPath '.\src\v343-asm\classes.list') -or
    -not (Test-Path -LiteralPath '.\src\v343-asm\java\V343ClassEmitter.java')) {
    throw 'The local v3.4.3 source overlay is missing. DO NOT download an old GitHub source ZIP over this folder.'
}
$names = @(Get-Content -LiteralPath '.\src\v343-asm\classes.list' | Where-Object { $_.Trim() -and -not $_.Trim().StartsWith('#') })
if ($names.Count -ne 43) { throw "Expected 43 reconstructed classes. Found $($names.Count). No files were changed." }
if (-not (Test-Path -LiteralPath '.\src\main\resources\vivecraftcompat.mixins.json')) {
    throw 'The mixin config is missing from src/main/resources.'
}
if (-not (Select-String -Path '.\src\main\resources\vivecraftcompat.mixins.json' -Pattern 'AeronauticsLevititeCatalyzerHandlerMixin' -Quiet)) {
    throw 'Your mixin config is not the custom v3.4.3 version. No files were changed.'
}
$propertyText = Get-Content -LiteralPath '.\gradle.properties' -Raw
if ($propertyText -notmatch '(?m)^\s*mod_version\s*=\s*3\.4\.3\s*$') {
    throw 'Set mod_version=3.4.3 in gradle.properties first. No files were changed.'
}

Write-Host 'Source checks passed. Preserving the local Java source.' -ForegroundColor Green
$backup = Join-Path $env:TEMP ("VCC-Gradle-backup-" + (Get-Date -Format 'yyyyMMdd-HHmmss'))
New-Item -ItemType Directory -Path $backup | Out-Null
foreach ($file in @('build.gradle','v343-source.gradle')) {
    if (Test-Path -LiteralPath $file) {
        Copy-Item -LiteralPath $file -Destination (Join-Path $backup $file)
    }
}
Write-Host "Backed up build scripts to $backup"

# Only the Gradle scripts get updated from GitHub. The source folder is never overwritten.
$raw = 'https://raw.githubusercontent.com/DeleDeki/Vivecraft-Compat-fixes/main/'
$downloadedBuild = Join-Path $backup 'build.gradle.new'
$downloadedV343 = Join-Path $backup 'v343-source.gradle.new'
Invoke-WebRequest -Uri ($raw + 'build.gradle') -OutFile $downloadedBuild -UseBasicParsing
Invoke-WebRequest -Uri ($raw + 'v343-source.gradle') -OutFile $downloadedV343 -UseBasicParsing
if (-not (Select-String -Path $downloadedBuild -Pattern "apply from: 'v343-source.gradle'" -Quiet) -or
    -not (Select-String -Path $downloadedV343 -Pattern 'Missing registered mixin in JAR' -Quiet)) {
    throw 'Downloaded build scripts were not the verified fixed versions. Originals remain untouched.'
}
Copy-Item -LiteralPath $downloadedBuild -Destination '.\build.gradle'
Copy-Item -LiteralPath $downloadedV343 -Destination '.\v343-source.gradle'
Write-Host 'Updated ONLY the two Gradle build scripts.' -ForegroundColor Green

& '.\gradlew.bat' --no-build-cache clean build
if ($LASTEXITCODE -ne 0) { throw 'Gradle build failed. Do not install any JAR.' }

$jar = Get-ChildItem -LiteralPath '.\build\libs' -Filter '*.jar' -File |
    Where-Object { $_.Name -match '3\.4\.3' -and $_.Name -notmatch 'sources|javadoc' } |
    Sort-Object LastWriteTime -Descending | Select-Object -First 1
if (-not $jar) { throw 'No 3.4.3 mod JAR was generated. Do not install any JAR.' }

Add-Type -AssemblyName System.IO.Compression.FileSystem
$archive = [System.IO.Compression.ZipFile]::OpenRead($jar.FullName)
try {
    $entries = New-Object 'System.Collections.Generic.HashSet[string]'
    foreach ($entry in $archive.Entries) { [void]$entries.Add($entry.FullName) }
    foreach ($name in $names) {
        if (-not $entries.Contains($name.Trim() + '.class')) {
            throw "JAR missing a reconstructed class: $name"
        }
    }
    $cfg = $archive.GetEntry('vivecraftcompat.mixins.json')
    if ($null -eq $cfg) { throw 'JAR missing vivecraftcompat.mixins.json' }
    $reader = New-Object System.IO.StreamReader($cfg.Open())
    try { $mixins = $reader.ReadToEnd() | ConvertFrom-Json }
    finally { $reader.Dispose() }
    $allMixins = @($mixins.mixins) + @($mixins.client) + @($mixins.server)
    foreach ($name in $allMixins) {
        if ([string]::IsNullOrWhiteSpace($name)) { continue }
        $classPath = ($mixins.package + '.' + $name).Replace('.','/') + '.class'
        if (-not $entries.Contains($classPath)) {
            throw "JAR missing a registered mixin: $classPath"
        }
    }
    foreach ($needed in @(
        'com/tom/vivecraftcompat/create/CreateSeatVRBridge.class',
        'com/tom/vivecraftcompat/simulated/SableVRBridge.class',
        'com/tom/vivecraftcompat/simulated/SimulatedVRInputBridge.class',
        'com/tom/vivecraftcompat/mixin/compat/aeronautics/AeronauticsLevititeCatalyzerHandlerMixin.class'
    )) {
        if (-not $entries.Contains($needed)) { throw "JAR missing: $needed" }
    }
}
finally { $archive.Dispose() }

Write-Host ''
Write-Host 'SUCCESS: Built and verified all 43 reconstructed classes and registered mixins.' -ForegroundColor Green
Write-Host "MOD JAR: $($jar.FullName)" -ForegroundColor Green
Write-Host 'Copy ONLY this JAR into the Modrinth profile mods folder, replacing the previous Vivecraft Compat JAR.'
Write-Host 'This does not prove the mod works in VR yet; it prevents the known missing-class startup crash.'
