package net.maximerix.tuffblocks.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class TuffBrickWallBlock extends WallBlock {
	public TuffBrickWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
