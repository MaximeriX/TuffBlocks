package net.maximerix.tuffblocks.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {
		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(Blocks.TUFF.asItem());
			tabData.accept(TuffModBlocks.TUFF_STAIRS.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_SLAB.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_WALL.get().asItem());
			tabData.accept(TuffModBlocks.CHISELED_TUFF.get().asItem());
			tabData.accept(TuffModBlocks.POLISHED_TUFF.get().asItem());
			tabData.accept(TuffModBlocks.POLISHED_TUFF_STAIRS.get().asItem());
			tabData.accept(TuffModBlocks.POLISHED_TUFF_SLAB.get().asItem());
			tabData.accept(TuffModBlocks.POLISHED_TUFF_WALL.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_BRICKS.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_BRICK_STAIRS.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_BRICK_SLAB.get().asItem());
			tabData.accept(TuffModBlocks.TUFF_BRICK_WALL.get().asItem());
			tabData.accept(TuffModBlocks.CHISELED_TUFF_BRICKS.get().asItem());
		}
	}
}
