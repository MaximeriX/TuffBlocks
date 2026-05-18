package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;


public class TuffStairs extends StairsBlock {
	public TuffStairs() {
		super(() -> Blocks.AIR.defaultBlockState(),
				Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(TuffSoundTypes.TUFF)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
		);
	}
}