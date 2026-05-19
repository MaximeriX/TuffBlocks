package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TuffMod.MODID)
public class TuffItems {

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        regBlock(event, TuffBlocks.TUFF);
        regBlock(event, TuffBlocks.TUFF_STAIRS);
        regSlab(event,  TuffBlocks.TUFF_SLAB, TuffBlocks.TUFF_SLAB_DOUBLE);
        regBlock(event, TuffBlocks.TUFF_WALL);
        regBlock(event, TuffBlocks.CHISELED_TUFF);

        regBlock(event, TuffBlocks.POLISHED_TUFF);
        regBlock(event, TuffBlocks.POLISHED_TUFF_STAIRS);
        regSlab(event,  TuffBlocks.POLISHED_TUFF_SLAB, TuffBlocks.POLISHED_TUFF_SLAB_DOUBLE);
        regBlock(event, TuffBlocks.POLISHED_TUFF_WALL);

        regBlock(event, TuffBlocks.TUFF_BRICKS);
        regBlock(event, TuffBlocks.TUFF_BRICK_STAIRS);
        regSlab(event,  TuffBlocks.TUFF_BRICK_SLAB, TuffBlocks.TUFF_BRICK_SLAB_DOUBLE);
        regBlock(event, TuffBlocks.TUFF_BRICK_WALL);
        regBlock(event, TuffBlocks.CHISELED_TUFF_BRICKS);
    }

    private static void regBlock(RegistryEvent.Register<Item> event, Block block) {
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        item.setCreativeTab(net.minecraft.creativetab.CreativeTabs.BUILDING_BLOCKS);
        event.getRegistry().register(item);
    }

    private static void regSlab(RegistryEvent.Register<Item> event, Block halfSlab, Block doubleSlab) {
        ItemSlab item = new ItemSlab(halfSlab, (BlockSlab) halfSlab, (BlockSlab) doubleSlab);
        item.setRegistryName(halfSlab.getRegistryName());
        item.setCreativeTab(net.minecraft.creativetab.CreativeTabs.BUILDING_BLOCKS);
        event.getRegistry().register(item);
    }
}
