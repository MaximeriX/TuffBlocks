package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TuffItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TuffMod.MODID);

    public static final RegistryObject<Item> TUFF = registerBlock(TuffBlocks.TUFF);
    public static final RegistryObject<Item> TUFF_STAIRS = registerBlock(TuffBlocks.TUFF_STAIRS);
    public static final RegistryObject<Item> TUFF_SLAB = registerBlock(TuffBlocks.TUFF_SLAB);
    public static final RegistryObject<Item> TUFF_WALL = registerBlock(TuffBlocks.TUFF_WALL);
    public static final RegistryObject<Item> CHISELED_TUFF = registerBlock(TuffBlocks.CHISELED_TUFF);

    public static final RegistryObject<Item> POLISHED_TUFF = registerBlock(TuffBlocks.POLISHED_TUFF);
    public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = registerBlock(TuffBlocks.POLISHED_TUFF_STAIRS);
    public static final RegistryObject<Item> POLISHED_TUFF_SLAB = registerBlock(TuffBlocks.POLISHED_TUFF_SLAB);
    public static final RegistryObject<Item> POLISHED_TUFF_WALL = registerBlock(TuffBlocks.POLISHED_TUFF_WALL);

    public static final RegistryObject<Item> TUFF_BRICKS = registerBlock(TuffBlocks.TUFF_BRICKS);
    public static final RegistryObject<Item> TUFF_BRICK_STAIRS = registerBlock(TuffBlocks.TUFF_BRICK_STAIRS);
    public static final RegistryObject<Item> TUFF_BRICK_SLAB = registerBlock(TuffBlocks.TUFF_BRICK_SLAB);
    public static final RegistryObject<Item> TUFF_BRICK_WALL = registerBlock(TuffBlocks.TUFF_BRICK_WALL);
    public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = registerBlock(TuffBlocks.CHISELED_TUFF_BRICKS);

    private static RegistryObject<Item> registerBlock(RegistryObject<? extends Block> block) {
        return ITEMS.register(block.getId().getPath(),
                () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    }
}