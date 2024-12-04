package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.resources.ResourceLocation;

public class PolishedTuffWallBlock extends WallBlock {
	public PolishedTuffWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
