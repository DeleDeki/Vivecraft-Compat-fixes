package com.tom.vivecraftcompat.simulated;
import com.mojang.blaze3d.platform.InputConstants;
import com.tom.vivecraftcompat.VRMode;
import net.minecraft.client.Minecraft;
import org.vivecraft.client.VivecraftVRMod;
/** Reconstructed from v3.4.3; optional dependency on rebuilt SimulatedVRInputBridge. */
public final class TypewriterKeyMappingGuard {
    private TypewriterKeyMappingGuard() {}
    public static boolean shouldBlock(InputConstants.Key key) {
        if (!VRMode.isVR() || !SimulatedVRInputBridge.isTypewriterModeActive()
                || Minecraft.getInstance().screen != null || key == null
                || key.getType() == InputConstants.Type.MOUSE || key.getValue() < 0) return false;
        if (VivecraftVRMod.INSTANCE != null && VivecraftVRMod.INSTANCE.keyMenuButton != null
                && VivecraftVRMod.INSTANCE.keyMenuButton.getKey().equals(key)) return false;
        return true;
    }
}