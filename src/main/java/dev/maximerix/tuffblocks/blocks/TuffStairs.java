package dev.maximerix.tuffblocks.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class TuffStairs extends StairBlock {
	public TuffStairs() {
		super(() -> Blocks.AIR.defaultBlockState(),
				Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(SoundType.TUFF)
						.strength(1.5f, 6f)
						.requiresCorrectToolForDrops()
		);
	}
}