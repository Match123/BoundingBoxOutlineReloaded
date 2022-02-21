package com.irtimaled.bbor.mixin.client.settings;

import com.irtimaled.bbor.client.keyboard.KeyListener;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Map;

@Mixin(KeyBinding.class)
public class MixinKeyBinding {
    @Final
    @Shadow
    private static Map<String, Integer> CATEGORY_ORDER_MAP;

    static {
        CATEGORY_ORDER_MAP.put(KeyListener.Category, 0);
    }
}
