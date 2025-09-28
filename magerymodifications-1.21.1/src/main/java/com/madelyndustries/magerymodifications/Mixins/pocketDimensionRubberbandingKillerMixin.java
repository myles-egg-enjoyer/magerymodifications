package com.madelyndustries.magerymodifications.Mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import io.redspace.ironsspellbooks.capabilities.magic.PocketDimensionManager;
import net.minecraft.world.level.Level;

@Mixin(PocketDimensionManager.class)
public class pocketDimensionRubberbandingKillerMixin {
    @Inject(method="tick",at=@At("HEAD"), cancellable = true)
    private static void tick(Level level, CallbackInfo ci){
        ci.cancel();
    }
}
