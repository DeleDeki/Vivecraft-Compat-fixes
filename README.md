# Vivecraft Compat — Recuria VR fixes

**Unofficial compatibility fixes for Vivecraft on Minecraft 1.21.1 (NeoForge).**

This is a community-maintained source reconstruction based on [tom5454's original ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat). It keeps the original compatibility features and adds fixes used in the Recuria VR modpack, especially for Create vehicles, Sable / Simulated contraptions, and VR typewriter input.

**This is not an official release by the original ViveCraftCompat author or the Vivecraft team.**

## What v3.4.3 changes

- **Create 6 train and contraption seats:** VR view rotation follows the moving vehicle instead of leaving your view behind or applying incorrect yaw.
- **Sable / Simulated moving structures:** VR pose / view handling for moving sublevels, including rotation-sensitive setups.
- **Typewriter controls:** Prevents movement keys from moving the player while operating supported typewriter interfaces, while preserving their intended input / frequency handling.
- **Related VR interaction and compatibility fixes:** Includes changes to Create controls, VR input handling and rendering / aiming compatibility.

### What has been tested?

The **v3.4.3 JAR was successfully built from the source in this repository** and launched with Minecraft 1.21.1 / NeoForge in VR. **Seat rotation and typewriter controls were tested and reported working in VR** on the Recuria setup.

This does *not* establish compatibility with every possible mod combination. The Vivecraft long-press-Y virtual keyboard behavior has **not** been confirmed.

## Installation

1. Use **Minecraft 1.21.1 with NeoForge**.
2. Install [Vivecraft](https://modrinth.com/mod/vivecraft) and the dependencies required by ViveCraftCompat (including Customizable Player Models / CPM, as declared in the mod metadata).
3. Install the other mods whose features you want to use (for example, **Create 6**, **Sable** or the applicable Simulated / Aeronautics mods).
4. Put the **v3.4.3 release JAR** into your Minecraft `mods` folder.
5. **Remove any other ViveCraftCompat JAR** so there is only one version installed.

The tested environment included Vivecraft **1.3.15**, Create **6.0.10**, Sable **2.0.6**, and NeoForge **21.1.262**. These are the versions used for testing, not a promise that other versions are compatible. Java **21** is used for the build.

## Build from source

The complete buildable source is **included in this repository**. No unofficial 1.6 JAR, external patch ZIP or Python installation is needed for the normal source build.

**Windows (PowerShell):**

```powershell
git clone https://github.com/DeleDeki/Vivecraft-Compat-fixes.git
cd Vivecraft-Compat-fixes
.\gradlew.bat --no-build-cache clean build
```

**Linux / macOS:**

```bash
git clone https://github.com/DeleDeki/Vivecraft-Compat-fixes.git
cd Vivecraft-Compat-fixes
bash ./gradlew --no-build-cache clean build
```

Use **JDK 21**. The mod JAR is written to `build/libs/` (choose the JAR without `sources` in its name).

The Gradle build checks that all **43 reconstructed classes** and **30 registered mixins** are present in the final JAR. It prints `VERIFIED: 43 custom classes and 30 mixins` on successful validation. A missing class makes the build fail rather than silently creating a broken JAR.

GitHub Actions is available for optional build verification, but releases are **built, tested and uploaded manually**.

## How the source is organized

| Path | Purpose |
| --- | --- |
| `src/main/java/` | Original ViveCraftCompat 1.5.1 Java source foundation |
| `src/v343-asm/java/` | Java 21 bytecode emitters reconstructing the 43 changed/new v3.4.3 classes |
| `src/v343-asm/classes.list` | List of classes included in the reconstruction |
| `src/main/resources/` | Mod metadata, resources and mixin configuration |
| `v343-source.gradle` | Compiles the Java emitters, merges their output and validates the JAR |
| `porting/reference-java/` | Readable reference fragments **not** compiled into the mod |

**Source transparency:** The v3.4.3 changes are provided as Java ASM emitter sources, rather than conventional handwritten Java implementations. The source is rebuildable, but the 43 reconstructed classes are not yet an idiomatic high-level Java port. See [PORTING.md](PORTING.md) for the technical explanation.

## Feedback and bug reports

Please report problems in [this fork's GitHub issues](https://github.com/DeleDeki/Vivecraft-Compat-fixes/issues), **not** on the original author's issue tracker. Include Minecraft, NeoForge, Vivecraft, Create / Sable versions, the full crash log if applicable, and whether you were in VR or flatscreen.

## Credits and license

- **Original project:** [tom5454/ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat) — original source and the **MIT license**, retained in [LICENSE](LICENSE).
- **Additional compatibility fixes:** Reconstructed and maintained for use with Recuria VR; this repository does not claim that the earlier unofficial binary modifications were authored by the Recuria community.
- This fork is independent of the original ViveCraftCompat and Vivecraft projects.

For release changes, see [CHANGELOG.md](CHANGELOG.md). For Modrinth listing text and upload information, see [MODRINTH.md](MODRINTH.md).
