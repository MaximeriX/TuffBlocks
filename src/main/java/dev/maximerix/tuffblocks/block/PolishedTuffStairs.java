// PolishedTuffStairs.java — fixed for 1.15.2
package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class PolishedTuffStairs extends StairsBlock {
	public PolishedTuffStairs() {
		super(() -> Blocks.STONE.getDefaultState(),
				Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA)
						.sound(TuffSoundTypes.POLISHED_TUFF)
						.hardnessAndResistance(1.5f, 6f)
						.harvestTool(ToolType.PICKAXE)
						.harvestLevel(0)
		);
	}
}