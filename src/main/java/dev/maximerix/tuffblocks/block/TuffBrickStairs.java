package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TuffBrickStairs extends StairsBlock {
	public TuffBrickStairs() {
		super(() -> Blocks.AIR.defaultBlockState(),
				Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(TuffSoundTypes.TUFF_BRICKS)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
		);
	}
}