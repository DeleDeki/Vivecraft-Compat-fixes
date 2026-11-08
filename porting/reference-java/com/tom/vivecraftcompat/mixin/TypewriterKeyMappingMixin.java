package com.tom.vivecraftcompat.mixin;
import com.mojang.blaze3d.platform.InputConstants;
import com.tom.vivecraftcompat.simulated.TypewriterKeyMappingGuard;
import net.minecraft.client.KeyMapping;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.vivecraft.client.VivecraftVRMod;
/** Reconstructed from v3.4.3; needs rebuilding and runtime test with modded keybinds. */
@Mixin(KeyMapping.class)
public class TypewriterKeyMappingMixin {
    @Inject(method = "click", at = @At("HEAD"), cancellable = true)
    private static void vivecraftcompat$interceptClick(InputConstants.Key key, CallbackInfo ci) {
        if (TypewriterKeyMappingGuard.shouldBlock(key)) ci.cancel();
    }
    @Inject(method = "set", at = @At("HEAD"), cancellable = true)
    private static void vivecraftcompat$interceptSet(InputConstants.Key key, boolean down, CallbackInfo ci) {
        if (down && TypewriterKeyMappingGuard.shouldBlock(key)) ci.cancel();
    }
    @Inject(method = "setDown", at = @At("HEAD"), cancellable = true)
    private void vivecraftcompat$interceptSetDown(boolean down, CallbackInfo ci) {
        if (VivecraftVRMod.INSTANCE != null && VivecraftVRMod.INSTANCE.keyMenuButton == (Object)this) return;
        if (down && TypewriterKeyMappingGuard.shouldBlock(((KeyMapping)(Object)this).getKey())) ci.cancel();
    }
    @Inject(method = "isDown", at = @At("HEAD"), cancellable = true)
    private void vivecraftcompat$interceptIsDown(CallbackInfoReturnable<Boolean> cir) {
        if (VivecraftVRMod.INSTANCE != null && VivecraftVRMod.INSTANCE.keyMenuButton == (Object)this) return;
        if (TypewriterKeyMappingGuard.shouldBlock(((KeyMapping)(Object)this).getKey())) cir.setReturnValue(false);
    }
    @Inject(method = "consumeClick", at = @At("HEAD"), cancellable = true)
    private void vivecraftcompat$interceptConsumeClick(CallbackInfoReturnable<Boolean> cir) {
        if (VivecraftVRMod.INSTANCE != null && VivecraftVRMod.INSTANCE.keyMenuButton == (Object)this) return;
        if (TypewriterKeyMappingGuard.shouldBlock(((KeyMapping)(Object)this).getKey())) cir.setReturnValue(false);
    }
}