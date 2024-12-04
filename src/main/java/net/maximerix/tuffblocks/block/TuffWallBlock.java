package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.resources.ResourceLocation;

public class TuffWallBlock extends WallBlock {
	public TuffWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
