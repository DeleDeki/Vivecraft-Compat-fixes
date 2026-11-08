# Vivecraft Compat — Recuria VR fixes

Unofficial Minecraft 1.21.1 / NeoForge compatibility work based on the [original ViveCraftCompat project](https://github.com/tom5454/ViveCraftCompat). Original copyright and MIT license are retained.

## Two different builds

**Upstream source build:** `gradlew.bat clean build` compiles the editable official 1.5.1 Java source in `src/main/java`. This produces **1.5.1, without the Recuria VR changes**. The uploaded `vivecraftcompat-1.21-1.5.1-sources.jar` is simply the Gradle source archive.

**Tested custom build:** `gradlew.bat buildTestedV343` reconstructs the user-tested custom v3.4.3 class files from the local input 1.6.0 JAR and the accompanying bytecode patch-kit ZIP. It verifies the resulting class/resource checksums. **This is a binary patch build, not yet a complete Java-source compilation.**

### Rebuild the tested v3.4.3 JAR

1. Install Java 21 and Python 3.9+.
2. Create a folder named `local-input` in the repository root.
3. Copy these two files into it:
   - `vivecraftcompat-1.21-1.6.0.jar` (exact historical base JAR)
   - `vivecraftcompat-v3.4.3-source-and-rebuild.zip` (the patch kit)
4. Run `gradlew.bat buildTestedV343` from a Windows command prompt in the repository root.
5. Find the verified artifact under `build/libs/vivecraftcompat-fixed-v3.4.3.jar`.

You can also use `py -3 tools/rebuild-v343.py local-input/vivecraftcompat-1.21-1.6.0.jar local-input/vivecraftcompat-v3.4.3-source-and-rebuild.zip` directly, without Gradle.

**Do not commit the input JARs.** `local-input/` is ignored by Git.

## User-tested VR features of custom v3.4.3

- Sable sublevel view rotation including pitch/roll on planes and rollercoasters.
- Create 6 moving trains/contraptions yaw rotation in VR seats.
- VR typewriter frequency controls with movement-input handling.
- VR aiming and graphics compatibility changes.

The virtual keyboard shortcut is not confirmed to work in this build.

## Source reconstruction progress

The official 1.5.1 code, Gradle wrapper, MIT license and resources are stored in this repository. `porting/reference-java` contains reconstructed Java fragments that are **not yet part of the compilable source tree**. See [PORTING.md](PORTING.md) for the missing 1.6.0 source and test checklist.

We are preserving the established VR behavior while completing the editable Java port. Until then, the tested custom build and the upstream source build are different outputs.

## Publication and attribution

This is an **unofficial fork**, not a release from the original ViveCraftCompat author. The upstream project is MIT-licensed. Contributions added in other builds should be attributed and distributed in accordance with the rights applicable to them. Ensure these rights cover everything uploaded publicly. Follow [Modrinth's content rules](https://modrinth.com/legal/rules/) and apply its AI-assistance disclosure requirements where appropriate.
