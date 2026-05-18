package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;

public class TuffBrickSlab extends SlabBlock {

	public TuffBrickSlab() {
		super(BlockBehaviour.Properties.of()
				.instrument(NoteBlockInstrument.BASEDRUM)
				.mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(TuffSoundTypes.TUFF_BRICKS)
				.strength(1.5f, 6f)
				.requiresCorrectToolForDrops()
		);
	}
}