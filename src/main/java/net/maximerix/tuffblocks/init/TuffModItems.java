package net.maximerix.tuffblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TUFF_STAIRS = register(TuffModBlocks.TUFF_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_SLAB = register(TuffModBlocks.TUFF_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_WALL = register(TuffModBlocks.TUFF_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHISELED_TUFF = register(TuffModBlocks.CHISELED_TUFF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_TUFF = register(TuffModBlocks.POLISHED_TUFF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_TUFF_STAIRS = register(TuffModBlocks.POLISHED_TUFF_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_TUFF_SLAB = register(TuffModBlocks.POLISHED_TUFF_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item POLISHED_TUFF_WALL = register(TuffModBlocks.POLISHED_TUFF_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_BRICKS = register(TuffModBlocks.TUFF_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_BRICK_STAIRS = register(TuffModBlocks.TUFF_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_BRICK_SLAB = register(TuffModBlocks.TUFF_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TUFF_BRICK_WALL = register(TuffModBlocks.TUFF_BRICK_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHISELED_TUFF_BRICKS = register(TuffModBlocks.CHISELED_TUFF_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
