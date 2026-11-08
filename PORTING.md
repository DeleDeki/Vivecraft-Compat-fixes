# Porting status (8 November 2026)

A Java-source reconstruction layer now exists for all 43 classes that were added or changed in tested v3.4.3. Its sources were delivered as `vivecraftcompat-v3.4.3-java-source-overlay.zip` in the project chat and must be extracted and pushed into this repository by the repository owner. The layer's Java ASM emitters compile with JDK 21 and regenerate class files without requiring the historic unofficial 1.6.0 binary. All 43 regenerated classes were compared to the tested v3.4.3 using ASM semantic traces and matched.

**Important distinction:** ASM emitters are executable low-level Java source, not clean, readable original source. The full conversion of v3.4.3 systems into high-level, idiomatic Java remains the next task. The GitHub Actions workflow `decompile-v343.yml` can produce a Vineflower decompilation artifact after the source ZIP is pushed. The Java source-based mod JAR still needs a real Minecraft VR startup and functional test.

The older reconstruction notes below describe the state before the ASM source layer was developed.

---

# v3.4.3 source porting status

This repository contains the **original MIT-licensed ViveCraftCompat 1.5.1 Gradle source** (unchanged in `src/`) plus reconstructed source references in `porting/reference-java/`.

## Important: build status

`./gradlew build` (or `gradlew.bat build` on Windows with Java 21) is intended to build **the upstream 1.5.1 source foundation**, **NOT** the user's working custom v3.4.3 JAR. The Gradle build has **not** been executed successfully in this environment (network/dependency resolution is unavailable). The custom 1.6.0 and v3.4.3 source port remains incomplete.

Reference Java files under `porting/reference-java` intentionally stay out of `src/main/java` because they depend on code not yet ported. Adding them to the active build early may break compilation.

## Where the working build came from

The user supplied unofficial `vivecraftcompat-1.21-1.6.0.jar` (SHA-256 `bbcf66475d4bd7575036e5f2ebe81bca6b26aaa1d29f6ba0370e9d0ae4dbb82f`).
The user's tested `vivecraftcompat-fixed-v3.4.3-typewriter-controls.jar` has SHA-256 `3917875423348ca11c559ef5f2a6206f1610a6134b654418e347b0d49356f3c8`. It was assembled by bytecode patches, and is not itself a source-built artifact. The earlier source/rebuild ZIP in the ChatGPT conversation contains a reproducible patch script and disassemblies. Please retain your original JAR and that ZIP privately as references.

## Source work remaining to reproduce v3.4.3

1. Reconstruct the unofficial 1.6.0 Java classes not present in official 1.5.1, especially `simulated/SableVRBridge`, `simulated/SimulatedVRInputBridge`, `create/CreateSeatVRBridge`, `create/CreateSchematicVRInputBridge`, and related simulated/VR pose mixins.
2. Port the **aiming fix**: the custom `SimulatedGameRendererMixin` is deliberately not registered in v3.4.3. Avoid overriding Vivecraft's normal entity targeting on ordinary ground.
3. Port the Create train bridge, the native-seat-rotation suppression mixin, and vehicle resolver while avoiding reversed/doubled camera rotation.
4. Port typewriter input handling including VR signal dispatch before movement suppression, keyboard-opening key exception, right-click exit, vanilla/modded key mapping suppression, and flatscreen input.
5. Port the rendering fixes, including the removed extra VR keyboard depth clear. Retain the 1.5.1 official compatibility features.
6. Update Gradle dependencies for the exact runtime APIs: Minecraft 1.21.1, NeoForge 21.1.x, Create 6.0.10, Vivecraft 1.3.15, Sable 2.0.6, Create Aeronautics/Simulated 1.3.2 as appropriate, plus the other integration APIs.
7. Verify `gradlew.bat clean build` with JDK 21, inspect the output JAR mixin registration, test mod startup, VR train yaw, Sable 3D orientation, aiming, typewriter frequencies/hotkeys, right-click exit, and flat-screen typewriters.

## Rights and provenance

Upstream original source: https://github.com/tom5454/ViveCraftCompat (MIT; copyright retained in LICENSE). The source/rights for the additional unofficial 1.6.0 changes have **not** been established. Do not claim those additions were written by the original project authors, and confirm authorization before publicly redistributing reconstructed unofficial contributions.

## Suggested workflow

Develop the port on a separate branch; require a passing Java 21 Gradle build and Minecraft startup test before merging. Keep the existing known-working v3.4.3 binary for regression comparison rather than substituting an untested source build.
