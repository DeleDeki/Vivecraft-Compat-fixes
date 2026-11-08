package com.tom.vivecraftcompat.simulated;
import com.tom.vivecraftcompat.VRMode;
import org.vivecraft.client_vr.provider.MCVR;
/** Reconstructed from v3.4.3; must be wired up in the right event order. */
public final class TypewriterMotionGuard {
    private TypewriterMotionGuard() {}
    public static void afterBindings() {
        if (VRMode.isVR() && SimulatedVRInputBridge.isTypewriterModeActive()) {
            MCVR mcvr = MCVR.get();
            if (mcvr != null && mcvr.movement != null) mcvr.movement.set(0f, 0f);
        }
    }
}