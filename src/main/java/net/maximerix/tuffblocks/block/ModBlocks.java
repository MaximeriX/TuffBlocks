package net.maximerix.tuffblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maximerix.tuffblocks.TuffBlocks;
import net.maximerix.tuffblocks.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)
                    .strength(1.5f, 6f)
                    .sounds(ModSounds.TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block CHISELED_TUFF = registerBlock("chiseled_tuff",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //

    public static final Block POLISHED_TUFF = registerBlock("polished_tuff",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                    .requiresTool()),
                    ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)
                    .strength(1.5f, 6f)
                    .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                    .requiresTool()),
                    ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //

    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_BRICKS_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUFF)
                    .strength(1.5f, 6f)
                    .sounds(ModSounds.TUFF_BRICKS_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_BRICKS_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_BRICKS_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    //
    public static final Block CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY)
                    .strength(1.5f,6f )
                    .sounds(ModSounds.TUFF_BRICKS_SOUNDS)
                    .requiresTool()),
            ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TuffBlocks.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TuffBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {

    }
}