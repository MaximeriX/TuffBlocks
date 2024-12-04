package net.maximerix.tuffblocks.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TuffBrickStairsBlock extends StairBlock {
	public TuffBrickStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.break")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.step")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.place")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.hit")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(new ForgeSoundType(1.0f, 1.0f,
								() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.break")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.step")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.place")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.hit")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.fall"))))
						.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
		setRegistryName("tuff_brick_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
