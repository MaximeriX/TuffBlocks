package net.maximerix.tuffblocks.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class TuffWallBlock extends WallBlock {
	public TuffWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(SoundType.TUFF)
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
