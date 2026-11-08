# Source layout and reconstruction status

**Current status (8 November 2026):** v3.4.3 has been reconstructed as a **rebuildable Java 21 project**, the reconstructed sources are committed in this repository, GitHub Actions has produced a successful build, and a locally source-built JAR was **tested in Minecraft VR**. Create seat rotation and typewriter operation worked in that test.

## What builds today

The Gradle project starts with the upstream ViveCraftCompat 1.5.1 source in `src/main/java`. A Java 21 ASM emitter layer under `src/v343-asm/java` generates the **43 added or modified v3.4.3 class files**. `v343-source.gradle` merges those classes into the final JAR, replacing matching upstream classes, and verifies that every registered mixin class exists.

The mixin list is in `src/main/resources/vivecraftcompat.mixins.json`; the generated JAR has **30 registered mixins**. A prior Gradle packaging mistake omitted some generated mixins, causing an Aeronautics mixin startup crash. Packaging now has strict missing-class checks, and the corrected locally built JAR has launched successfully in VR.

### Build

With JDK 21:

```bash
./gradlew --no-build-cache clean build
```

On Windows use `gradlew.bat`. Find the main mod JAR in `build/libs` and verify that Gradle printed `VERIFIED: 43 custom classes and 30 mixins`.

## Important source distinction

The 43 Java files in `src/v343-asm/java/asm/` are **bytecode emitters**. They generate JVM class files and are valid, maintainable Java build inputs, but they are **not** reconstructed high-level implementation source in normal mod-development style.

`porting/reference-java/` contains a small set of readable reconstruction references. These are **not** used to produce the release JAR. The optional `.github/workflows/decompile-v343.yml` workflow can create additional readable decompilation references for future refactoring.

The source build **does not need the unofficial 1.6.0 JAR**. The older `buildTestedV343` task in `build.gradle` and `tools/rebuild-v343.py` are legacy tools for historical binary comparisons; they are not the regular build path.

## Test coverage

**Confirmed:** The reconstructed source-built v3.4.3 JAR launched in VR, and the tester confirmed Create seat rotation and typewriter operation work.

**Not confirmed by this test:** Every other optional compatibility integration, every mix of mod versions, and Vivecraft's long-press-Y virtual keyboard behavior. Normal aiming should continue to be checked on the ground and while riding moving contraptions.

## Origin and attribution

Original project: [tom5454/ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat), MIT-licensed; original notices are preserved in `LICENSE`. This is an unofficial fork made available with source so its modifications can be inspected and rebuilt. It does not attribute the undocumented historical 1.6 binary changes to the original author or to the Recuria community.

## Next technical improvements

Convert ASM emitters into readable Java implementations one component at a time; compare behavior to the tested v3.4.3 release; keep regression tests for seats, moving sublevels, normal aiming, typewriter input/frequencies and flatscreen controls.
