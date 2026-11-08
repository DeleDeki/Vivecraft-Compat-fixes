# Modrinth listing — copy-ready text

This file is for the maintainer preparing a **manual Modrinth upload**. It is not an automatic publishing workflow.

## Suggested project title

**Vivecraft Compat — Recuria VR Fixes (Unofficial)**

## Short summary

Unofficial Vivecraft compatibility fixes for Create trains, Sable / Simulated moving structures and VR typewriters on Minecraft 1.21.1 NeoForge.

## Description

**Vivecraft Compat — Recuria VR Fixes** is an unofficial version of [ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat), intended to improve VR interaction with moving Create contraptions and other mods used in the Recuria VR modpack.

### Features

- **Create 6:** VR view follows the rotation of moving trains and contraptions while seated.
- **Sable / Simulated:** Compatibility handling for moving sublevels, poses and rotation.
- **Typewriters:** VR controls and input suppression to prevent unintended player movement while operating supported typewriter interfaces.
- Additional interaction and rendering / aiming compatibility changes.

### Compatibility

- **Game:** Minecraft 1.21.1
- **Mod loader:** NeoForge
- **Build:** Java 21
- **Tested with:** Vivecraft 1.3.15, Create 6.0.10, Sable 2.0.6, NeoForge 21.1.262
- **Dependencies:** Vivecraft and Customizable Player Models (CPM) are required by the mod metadata. Create, Sable, Simulated and Aeronautics are relevant to their respective compatibility features; install them as needed.

### Installing

Download the v3.4.3 JAR and place it in the `mods` folder of a Minecraft 1.21.1 NeoForge instance with its required dependencies. Remove any other version of ViveCraftCompat to avoid duplicate mod IDs.

### Testing and limitations

The source-built v3.4.3 JAR launched in Minecraft VR and **seat rotation and typewriter controls were verified working** on the Recuria setup. Compatibility with other mod combinations is not guaranteed. The long-press-Y VR virtual keyboard shortcut is not confirmed.

### Source and credits

[Public source code](https://github.com/DeleDeki/Vivecraft-Compat-fixes) | [Report issues](https://github.com/DeleDeki/Vivecraft-Compat-fixes/issues)

Based on the [original ViveCraftCompat by tom5454](https://github.com/tom5454/ViveCraftCompat), MIT-licensed. This is an **unofficial fork**, not an original-author or Vivecraft team release. The v3.4.3 source is supplied as rebuildable Java bytecode emitters, with the original Java project retained.

## v3.4.3 version changelog

- Fixed Create VR seat yaw rotation on moving trains and contraptions.
- Added Sable / Simulated moving-sublevel VR pose compatibility.
- Improved VR typewriter controls and movement-input handling.
- Released complete, buildable reconstructed v3.4.3 source.
- Fixed the missing Aeronautics mixin packaging crash.
- Tested the source-built release in VR: **seat rotation and typewriter operation working**.

## Upload checklist

- Upload **the locally built and VR-tested v3.4.3 JAR**, not the `-sources.jar`.
- Select **Minecraft 1.21.1** and **NeoForge**. Use **v3.4.3** as the version number.
- Set the source URL to `https://github.com/DeleDeki/Vivecraft-Compat-fixes` and issues URL to `https://github.com/DeleDeki/Vivecraft-Compat-fixes/issues`.
- Review the required vs optional dependencies shown in the JAR metadata. Do not mark optional integration mods as required unless the release actually needs them.
- Attribute the original project and label the listing **unofficial** to avoid confusing users of the original mod.
- If you rebuild after modifying runtime resources, retest that new JAR; changing the repository does not modify the already-tested local JAR.
- Apply any platform-required disclosures and project/ownership declarations accurately.
