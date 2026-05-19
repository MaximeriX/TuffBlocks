package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class PolishedTuffSlab extends SlabBlock {
	public PolishedTuffSlab() {
		super(Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA)
				.sound(TuffSoundTypes.POLISHED_TUFF)
				.hardnessAndResistance(1.5f, 6f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(0)
		);
	}
}