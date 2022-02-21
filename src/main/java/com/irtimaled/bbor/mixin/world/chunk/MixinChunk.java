package com.irtimaled.bbor.mixin.world.chunk;

import com.irtimaled.bbor.common.interop.CommonInterop;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldChunk.class)
public class MixinChunk {
    @Inject(method = "loadEntities", at = @At("RETURN"))
    private void onLoad(CallbackInfo ci) {
        CommonInterop.chunkLoaded((WorldChunk) (Object) this);
    }
}
