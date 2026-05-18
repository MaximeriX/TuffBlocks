package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;

public class TuffWall extends WallBlock {

	public TuffWall() {
		super(BlockBehaviour.Properties.of()
				.instrument(NoteBlockInstrument.BASEDRUM)
				.mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(SoundType.TUFF)
				.strength(1.5f, 6f)
				.requiresCorrectToolForDrops()
		);
	}
}