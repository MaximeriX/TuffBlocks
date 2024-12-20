package net.maximerix.tuffblocks.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class TuffStairsBlock extends StairBlock {
	public TuffStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(SoundType.TUFF)
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
		setRegistryName("tuff_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
