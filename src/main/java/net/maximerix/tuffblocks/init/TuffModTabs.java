package net.maximerix.tuffblocks.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.maximerix.tuffblocks.TuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TuffMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
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
