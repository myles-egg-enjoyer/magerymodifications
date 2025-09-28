package com.madelyndustries.magerymodifications.mixins;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import io.redspace.ironsspellbooks.capabilities.magic.PocketDimensionManager;
import net.minecraft.world.level.Level;

@Mixin(PocketDimensionManager.class)
public abstract class PocketDimensionRubberbandingKillerMixin {
    @WrapMethod(method="tick")
    private void tick(Level level, Operation<Void> original){
    }
}
