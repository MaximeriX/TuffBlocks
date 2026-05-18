package dev.maximerix.tuffblocks.init;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {
		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(Blocks.TUFF.asItem());

			tabData.accept(TuffBlocks.TUFF_STAIRS.get().asItem());
			tabData.accept(TuffBlocks.TUFF_SLAB.get().asItem());
			tabData.accept(TuffBlocks.TUFF_WALL.get().asItem());
			tabData.accept(TuffBlocks.CHISELED_TUFF.get().asItem());

			tabData.accept(TuffBlocks.POLISHED_TUFF.get().asItem());
			tabData.accept(TuffBlocks.POLISHED_TUFF_STAIRS.get().asItem());
			tabData.accept(TuffBlocks.POLISHED_TUFF_SLAB.get().asItem());
			tabData.accept(TuffBlocks.POLISHED_TUFF_WALL.get().asItem());

			tabData.accept(TuffBlocks.TUFF_BRICKS.get().asItem());
			tabData.accept(TuffBlocks.TUFF_BRICK_STAIRS.get().asItem());
			tabData.accept(TuffBlocks.TUFF_BRICK_SLAB.get().asItem());
			tabData.accept(TuffBlocks.TUFF_BRICK_WALL.get().asItem());
			tabData.accept(TuffBlocks.CHISELED_TUFF_BRICKS.get().asItem());
		}
	}
}