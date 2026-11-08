# Vivecraft Compat — Recuria VR fixes

Unofficial Minecraft 1.21.1 / NeoForge compatibility work based on the [original ViveCraftCompat project](https://github.com/tom5454/ViveCraftCompat). Original copyright and MIT license are retained.


## Startup crash fix for Java-source builds (8 November 2026)

The first Gradle reconstruction build could produce a JAR without some of the 43 generated classes, causing `InvalidMixinException: AeronauticsLevititeCatalyzerHandlerMixin was not found`. The corrected `v343-source.gradle` now explicitly merges all 43 classes into the finished JAR and verifies every registered mixin. If any is missing, Gradle **fails the build** rather than producing a broken mod.

To update your existing clone, run `git pull` followed by `gradlew.bat --no-build-cache clean build`. Keep `src/v343-asm/` in your local project. Look for `VERIFIED: 43 custom classes and 30 mixins` in Gradle's output.

The Gradle build script also expands `META-INF/neoforge.mods.toml`, correcting the custom mod's displayed version from `0.0NONE` to `3.4.3` when `mod_version=3.4.3` in `gradle.properties`. This is a **packaging fix**, not a gameplay-code change; in-game VR testing is still required.

## Java-only v3.4.3 build (NEW)

A Java 21 source overlay has been reconstructed and verified against all 43 new/modified class structures in the user-tested v3.4.3. The full overlay ZIP was delivered in the project conversation; its Java files must be extracted and committed locally.

The reconstruction uses **Java ASM emitter source** instead of original high-level Java for the 43 patched classes. It no longer depends on an unofficial 1.6.0 JAR or a binary patch kit at build time, but it is not yet idiomatic, human-readable source for those systems.

1. In your cloned repository, extract `vivecraftcompat-v3.4.3-java-source-overlay.zip` over the repo root.
2. In `gradle.properties`, change `mod_version=1.5.1` to `mod_version=3.4.3`.
3. Build using Java 21: `gradlew.bat clean build` on Windows.
4. Commit `src/v343-asm/`, `src/main/resources/vivecraftcompat.mixins.json`, `src/main/resources/assets/vivecraftcompat/lang/en_us.json`, and the version change, then push.
5. GitHub Actions → **Build Vivecraft Compat v3.4.3 from Java source** → view artifacts, once the source files are pushed.

The Gradle build automatically activates `v343-source.gradle` when `src/v343-asm/classes.list` exists. Output is under `build/libs/`. The source JAR includes the original upstream Java and the reconstructed emitter Java.

The local Java 21 source-only emitter compiled successfully, generated 43 modified classes, matched all 43 original ASM structural traces and produced an archive with the expected 68 classes. **Minecraft VR startup has not yet been tested with the rebuilt artifact**, and GitHub Actions will only be able to build it after the Java source files are committed.

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
