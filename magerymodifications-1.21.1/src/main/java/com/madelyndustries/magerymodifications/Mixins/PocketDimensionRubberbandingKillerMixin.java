package com.madelyndustries.magerymodifications.Mixins;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import org.spongepowered.asm.mixin.Mixin;
import io.redspace.ironsspellbooks.capabilities.magic.PocketDimensionManager;
import net.minecraft.world.level.Level;

@Mixin(value = PocketDimensionManager.class, remap = false)
public abstract class PocketDimensionRubberbandingKillerMixin {
    @WrapMethod(method="tick")
    public void tick(Level level, Operation<Void> original){
    }
}
