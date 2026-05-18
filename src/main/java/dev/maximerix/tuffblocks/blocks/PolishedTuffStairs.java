package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import dev.maximerix.tuffblocks.init.TuffBlocks;

public class PolishedTuffStairs extends StairBlock {

	public PolishedTuffStairs() {
		super(() -> TuffBlocks.POLISHED_TUFF.get().defaultBlockState(),
				BlockBehaviour.Properties.of()
						.instrument(NoteBlockInstrument.BASEDRUM)
						.mapColor(MapColor.TERRACOTTA_GRAY)
						.sound(TuffSoundTypes.POLISHED_TUFF)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
						.dynamicShape()
		);
	}
}