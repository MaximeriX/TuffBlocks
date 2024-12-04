package net.maximerix.tuffblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.maximerix.tuffblocks.TuffMod;

public class TuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TuffMod.MODID);
	public static final RegistryObject<Item> TUFF_STAIRS = block(TuffModBlocks.TUFF_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_SLAB = block(TuffModBlocks.TUFF_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_WALL = block(TuffModBlocks.TUFF_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_TUFF = block(TuffModBlocks.CHISELED_TUFF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF = block(TuffModBlocks.POLISHED_TUFF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = block(TuffModBlocks.POLISHED_TUFF_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = block(TuffModBlocks.POLISHED_TUFF_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = block(TuffModBlocks.POLISHED_TUFF_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICKS = block(TuffModBlocks.TUFF_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_STAIRS = block(TuffModBlocks.TUFF_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_SLAB = block(TuffModBlocks.TUFF_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_WALL = block(TuffModBlocks.TUFF_BRICK_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = block(TuffModBlocks.CHISELED_TUFF_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
