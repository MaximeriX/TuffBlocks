package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;

public class TuffBrickStairsBlock extends StairBlock {
	public TuffBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(new ForgeSoundType(1.0f, 1.0f,
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.break")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.step")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.place")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.hit")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.fall"))))
						.strength(1.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
