# Vivecraft Compat — Recuria VR fixes

Source reconstruction of the custom Minecraft 1.21.1 / NeoForge Vivecraft Compat work, based on the official MIT-licensed [ViveCraftCompat](https://github.com/tom5454/ViveCraftCompat).

> **Status:** Upstream source foundation. The unofficial 1.6.0 additions and tested v3.4.3 patches have **not yet been fully ported into compilable Java source**. Do not publish a JAR from this repository as the tested v3.4.3 until the port and game verification are complete.

The stable in-game test build was v3.4.3. It supports Create train view rotation and Sable sublevel rotation, with experimental typewriter fixes. Its code originated partly from an unofficial 1.6.0 binary; attribution/redistribution rights for those additional changes must be established separately from the upstream MIT code.

## Building

Install Java 21. For a source build of the current upstream foundation, run `gradlew.bat build` on Windows or `./gradlew build` on Unix; the JAR will be under `build/libs/`. An upstream-source build is not equivalent to the tested v3.4.3 until the port is complete.

See `PORTING.md` for the v3.4.3 reconstruction status and remaining work.
