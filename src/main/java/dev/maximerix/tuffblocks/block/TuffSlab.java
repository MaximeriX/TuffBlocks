package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TuffSlab extends SlabBlock {
	public TuffSlab() {
		super(Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(TuffSoundTypes.TUFF)
				.strength(1.5f, 6f)
				.requiresCorrectToolForDrops()
		);
	}
}