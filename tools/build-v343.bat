@echo off
setlocal
if "%~1"=="" (
  echo Usage: tools\build-v343.bat path\to\vivecraftcompat-1.21-1.6.0.jar path\to\vivecraftcompat-v3.4.3-source-and-rebuild.zip
  exit /b 2
)
if "%~2"=="" (
  echo Missing v3.4.3 patch kit ZIP.
  exit /b 2
)
py -3 "%~dp0rebuild-v343.py" "%~1" "%~2" --output "%~dp0..\build\libs\vivecraftcompat-fixed-v3.4.3.jar"
if errorlevel 1 (
  echo Failed. Check input versions and Python installation.
  exit /b 1
)
echo The verified mod is in build\libs\
