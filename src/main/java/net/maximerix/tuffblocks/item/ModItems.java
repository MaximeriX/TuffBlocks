package net.maximerix.tuffblocks.item;
import net.maximerix.tuffblocks.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.jetbrains.annotations.NotNull;

public class ModItems {
    private static void addItemsToBuilding_BlocksTabItemGroup(@NotNull FabricItemGroupEntries entries) {
        entries.add(Blocks.TUFF);
        entries.add(ModBlocks.TUFF_STAIRS);
        entries.add(ModBlocks.TUFF_SLAB);
        entries.add(ModBlocks.TUFF_WALL);
        entries.add(ModBlocks.CHISELED_TUFF);
        entries.add(ModBlocks.POLISHED_TUFF);
        entries.add(ModBlocks.POLISHED_TUFF_STAIRS);
        entries.add(ModBlocks.POLISHED_TUFF_SLAB);
        entries.add(ModBlocks.POLISHED_TUFF_WALL);
        entries.add(ModBlocks.TUFF_BRICKS);
        entries.add(ModBlocks.TUFF_BRICK_STAIRS);
        entries.add(ModBlocks.TUFF_BRICK_SLAB);
        entries.add(ModBlocks.TUFF_BRICK_WALL);
        entries.add(ModBlocks.CHISELED_TUFF_BRICKS);

    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuilding_BlocksTabItemGroup);
    }

}


