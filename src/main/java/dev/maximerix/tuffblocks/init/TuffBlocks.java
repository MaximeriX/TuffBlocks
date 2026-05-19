package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import dev.maximerix.tuffblocks.block.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TuffMod.MODID)
public class TuffBlocks {
    public static Block TUFF;
    public static Block TUFF_STAIRS;
    public static Block TUFF_SLAB;
    public static Block TUFF_SLAB_DOUBLE;
    public static Block TUFF_WALL;
    public static Block CHISELED_TUFF;

    public static Block POLISHED_TUFF;
    public static Block POLISHED_TUFF_STAIRS;
    public static Block POLISHED_TUFF_SLAB;
    public static Block POLISHED_TUFF_SLAB_DOUBLE;
    public static Block POLISHED_TUFF_WALL;

    public static Block TUFF_BRICKS;
    public static Block TUFF_BRICK_STAIRS;
    public static Block TUFF_BRICK_SLAB;
    public static Block TUFF_BRICK_SLAB_DOUBLE;
    public static Block TUFF_BRICK_WALL;
    public static Block CHISELED_TUFF_BRICKS;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        TuffSoundTypes.init();

        TUFF = reg(event, new Tuff(), "tuff");
        TUFF_STAIRS = reg(event, new TuffStairs(), "tuff_stairs");
        TUFF_SLAB = reg(event, new TuffSlab.Half(), "tuff_slab");
        TUFF_SLAB_DOUBLE = reg(event, new TuffSlab.Double(), "tuff_slab_double");
        TUFF_WALL = reg(event, new TuffWall(), "tuff_wall");
        CHISELED_TUFF = reg(event, new ChiseledTuff(), "chiseled_tuff");

        POLISHED_TUFF = reg(event, new PolishedTuff(), "polished_tuff");
        POLISHED_TUFF_STAIRS = reg(event, new PolishedTuffStairs(), "polished_tuff_stairs");
        POLISHED_TUFF_SLAB = reg(event, new PolishedTuffSlab.Half(), "polished_tuff_slab");
        POLISHED_TUFF_SLAB_DOUBLE = reg(event, new PolishedTuffSlab.Double(), "polished_tuff_slab_double");
        POLISHED_TUFF_WALL = reg(event, new PolishedTuffWall(), "polished_tuff_wall");

        TUFF_BRICKS = reg(event, new TuffBricks(), "tuff_bricks");
        TUFF_BRICK_STAIRS = reg(event, new TuffBrickStairs(), "tuff_brick_stairs");
        TUFF_BRICK_SLAB = reg(event, new TuffBrickSlab.Half(), "tuff_brick_slab");
        TUFF_BRICK_SLAB_DOUBLE = reg(event, new TuffBrickSlab.Double(), "tuff_brick_slab_double");
        TUFF_BRICK_WALL = reg(event, new TuffBrickWall(), "tuff_brick_wall");
        CHISELED_TUFF_BRICKS = reg(event, new ChiseledTuffBricks(), "chiseled_tuff_bricks");
    }

    private static Block reg(RegistryEvent.Register<Block> event, Block block, String name) {
        block.setRegistryName(TuffMod.MODID, name);
        block.setTranslationKey(TuffMod.MODID + "." + name);
        block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        event.getRegistry().register(block);
        return block;
    }
}
