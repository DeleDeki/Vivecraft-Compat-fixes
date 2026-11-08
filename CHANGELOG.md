# Changelog

## 3.4.3 — Minecraft 1.21.1 / NeoForge

Unofficial ViveCraftCompat compatibility build for the Recuria VR modpack.

### Features and compatibility work

- Fix VR seat view rotation on Create 6 trains and moving contraptions.
- Handle camera and tracked pose rotation on Sable / Simulated moving sublevels.
- Improve VR typewriter key handling so movement input does not move the player while using supported controls, without interfering with intended typewriter functionality.
- Include changes to VR interactions, aiming compatibility and related moving-structure integrations.

### Source and packaging

- Publish a rebuildable Java 21 source reconstruction for all 43 modified/new classes.
- Verify every custom class and all 30 registered mixins during packaging.
- Fix a startup crash caused by a missing `AeronauticsLevititeCatalyzerHandlerMixin` in the initial source-built JAR.
- Correct expansion of the NeoForge mod version metadata.

### Testing

A JAR built from this repository's reconstructed source was launched and tested in VR. **Seat rotation and typewriter controls were confirmed working.** Other combinations and the long-press-Y virtual keyboard shortcut are not fully validated.

### Attribution

Based on [tom5454's original ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat) (MIT). This is an unofficial fork, not an upstream release.
