package com.tom.vivecraftcompat.mixin.compat.create;
import com.tom.vivecraftcompat.create.CreateSeatVRBridge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/** Reconstructed from v3.4.3; requires CreateSeatVRBridge source implementation. */
@Mixin(targets = "com.simibubi.create.content.contraptions.actors.seat.ContraptionPlayerPassengerRotation", remap = false)
public abstract class CreateNativeSeatRotationMixin {
    @Inject(method = "frame", at = @At("HEAD"), cancellable = true, remap = false)
    private static void vivecraftcompat$useVrRotationInsteadOfCreate(CallbackInfo ci) {
        if (CreateSeatVRBridge.shouldSuppressCreateNativeRotation()) ci.cancel();
    }
}