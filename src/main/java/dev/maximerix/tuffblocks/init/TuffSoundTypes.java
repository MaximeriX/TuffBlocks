package dev.maximerix.tuffblocks.init;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.resources.ResourceLocation;
import dev.maximerix.tuffblocks.TuffMod;

public class TuffSoundTypes {
    private static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(TuffMod.MODID, path);
    }

    public static final ForgeSoundType POLISHED_TUFF = new ForgeSoundType(
            1.0f, 1.0f,
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.polished_tuff.break")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.polished_tuff.step")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.polished_tuff.place")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.polished_tuff.hit")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.polished_tuff.fall"))
    );

    public static final ForgeSoundType TUFF_BRICKS = new ForgeSoundType(
            1.0f, 1.0f,
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.tuff_bricks.break")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.tuff_bricks.step")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.tuff_bricks.place")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.tuff_bricks.hit")),
            () -> ForgeRegistries.SOUND_EVENTS.getValue(rl("block.tuff_bricks.fall"))
    );
}