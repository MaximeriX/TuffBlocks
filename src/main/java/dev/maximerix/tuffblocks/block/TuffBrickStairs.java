package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class TuffBrickStairs extends StairBlock {
	public TuffBrickStairs() {
		super(() -> Blocks.AIR.defaultBlockState(),
				Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(TuffSoundTypes.TUFF_BRICKS)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
		);
	}
}