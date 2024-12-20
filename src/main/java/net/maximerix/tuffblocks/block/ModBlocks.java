package net.maximerix.tuffblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maximerix.tuffblocks.TuffBlocks;
import net.maximerix.tuffblocks.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(BlockSoundGroup.TUFF)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(BlockSoundGroup.TUFF)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(BlockSoundGroup.TUFF)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block CHISELED_TUFF = registerBlock("chiseled_tuff",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(BlockSoundGroup.TUFF)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block POLISHED_TUFF = registerBlock("polished_tuff",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));

    //
    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            new StairsBlock(ModBlocks.POLISHED_TUFF.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.POLISHED_TUFF_SOUNDS)));
    //
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sounds(ModSounds.POLISHED_TUFF_SOUNDS)
                            .requiresTool()
                            .strength(1.5F, 6.0F)));
    //
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.TUFF_BRICKS_SOUNDS)));
    //
    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
            new StairsBlock(ModBlocks.TUFF_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.TUFF_BRICKS_SOUNDS)));
    //
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.TUFF_BRICKS_SOUNDS)));
    //
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.TUFF_BRICKS_SOUNDS)));
    //
    public static final Block CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.TUFF)
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(ModSounds.TUFF_BRICKS_SOUNDS)));
    //
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TuffBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TuffBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}