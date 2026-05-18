package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

@Mod.EventBusSubscriber(modid = TuffMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffTabs {

	@SubscribeEvent
	public static void buildTabContents(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			event.accept(Blocks.TUFF.asItem());

			event.accept(TuffBlocks.TUFF_STAIRS.get().asItem());
			event.accept(TuffBlocks.TUFF_SLAB.get().asItem());
			event.accept(TuffBlocks.TUFF_WALL.get().asItem());
			event.accept(TuffBlocks.CHISELED_TUFF.get().asItem());

			event.accept(TuffBlocks.POLISHED_TUFF.get().asItem());
			event.accept(TuffBlocks.POLISHED_TUFF_STAIRS.get().asItem());
			event.accept(TuffBlocks.POLISHED_TUFF_SLAB.get().asItem());
			event.accept(TuffBlocks.POLISHED_TUFF_WALL.get().asItem());

			event.accept(TuffBlocks.TUFF_BRICKS.get().asItem());
			event.accept(TuffBlocks.TUFF_BRICK_STAIRS.get().asItem());
			event.accept(TuffBlocks.TUFF_BRICK_SLAB.get().asItem());
			event.accept(TuffBlocks.TUFF_BRICK_WALL.get().asItem());
			event.accept(TuffBlocks.CHISELED_TUFF_BRICKS.get().asItem());
		}
	}
}