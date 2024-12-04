package net.maximerix.tuffblocks.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.TuffMod;

public class TuffModItems {
	public static final DeferredRegister<Item> REGISTRY = new DeferredRegister<>(ForgeRegistries.ITEMS, TuffMod.MODID);
	public static final RegistryObject<Item> TUFF = block(TuffModBlocks.TUFF, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_STAIRS = block(TuffModBlocks.TUFF_STAIRS, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_SLAB = block(TuffModBlocks.TUFF_SLAB, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_WALL = block(TuffModBlocks.TUFF_WALL, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_TUFF = block(TuffModBlocks.CHISELED_TUFF, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF = block(TuffModBlocks.POLISHED_TUFF, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = block(TuffModBlocks.POLISHED_TUFF_STAIRS, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = block(TuffModBlocks.POLISHED_TUFF_SLAB, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = block(TuffModBlocks.POLISHED_TUFF_WALL, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICKS = block(TuffModBlocks.TUFF_BRICKS, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_STAIRS = block(TuffModBlocks.TUFF_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_SLAB = block(TuffModBlocks.TUFF_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> TUFF_BRICK_WALL = block(TuffModBlocks.TUFF_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = block(TuffModBlocks.CHISELED_TUFF_BRICKS, ItemGroup.BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, ItemGroup tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().group(tab)));
	}
}
