package net.maximerix.tuffblocks.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class TuffStairsBlock extends StairBlock {
	public TuffStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_GRAY)
						.sound(SoundType.TUFF)
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
