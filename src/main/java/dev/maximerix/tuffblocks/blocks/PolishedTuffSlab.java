package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;

public class PolishedTuffSlab extends SlabBlock {

	public PolishedTuffSlab() {
		super(BlockBehaviour.Properties.of()
				.instrument(NoteBlockInstrument.BASEDRUM)
				.mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(TuffSoundTypes.POLISHED_TUFF)
				.strength(1.5f, 6f)
				.requiresCorrectToolForDrops()
		);
	}
}