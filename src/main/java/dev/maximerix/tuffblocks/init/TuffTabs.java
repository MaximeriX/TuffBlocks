package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TuffMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tab) {
		if (tab.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tab.accept(Blocks.TUFF.asItem());

			tab.accept(TuffBlocks.TUFF_STAIRS.get().asItem());
			tab.accept(TuffBlocks.TUFF_SLAB.get().asItem());
			tab.accept(TuffBlocks.TUFF_WALL.get().asItem());
			tab.accept(TuffBlocks.CHISELED_TUFF.get().asItem());

			tab.accept(TuffBlocks.POLISHED_TUFF.get().asItem());
			tab.accept(TuffBlocks.POLISHED_TUFF_STAIRS.get().asItem());
			tab.accept(TuffBlocks.POLISHED_TUFF_SLAB.get().asItem());
			tab.accept(TuffBlocks.POLISHED_TUFF_WALL.get().asItem());

			tab.accept(TuffBlocks.TUFF_BRICKS.get().asItem());
			tab.accept(TuffBlocks.TUFF_BRICK_STAIRS.get().asItem());
			tab.accept(TuffBlocks.TUFF_BRICK_SLAB.get().asItem());
			tab.accept(TuffBlocks.TUFF_BRICK_WALL.get().asItem());
			tab.accept(TuffBlocks.CHISELED_TUFF_BRICKS.get().asItem());
		}
	}
}