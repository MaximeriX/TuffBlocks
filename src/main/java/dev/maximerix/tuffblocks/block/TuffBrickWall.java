package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TuffBrickWall extends WallBlock {
	public TuffBrickWall() {
		super(Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(TuffSoundTypes.TUFF_BRICKS)
				.strength(1.5f, 6f)
				.requiresCorrectToolForDrops()
		);
	}
}