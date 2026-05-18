package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class TuffStairs extends StairBlock {

	public TuffStairs() {
		super(() -> Blocks.TUFF.defaultBlockState(),
				BlockBehaviour.Properties.of()
						.instrument(NoteBlockInstrument.BASEDRUM)
						.mapColor(MapColor.TERRACOTTA_GRAY)
						.sound(SoundType.TUFF)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
						.dynamicShape()
		);
	}
}