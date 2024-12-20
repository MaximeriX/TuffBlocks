package net.maximerix.tuffblocks.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class TuffSlabBlock extends SlabBlock {
	public TuffSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(SoundType.TUFF)
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
