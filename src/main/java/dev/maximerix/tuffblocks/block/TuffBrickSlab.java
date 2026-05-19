package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffBlocks;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;

public abstract class TuffBrickSlab extends AbstractTuffSlab {
    protected TuffBrickSlab() {
        super(TuffSoundTypes.TUFF_BRICKS, MapColor.STONE);
    }

    public static class Half extends TuffBrickSlab {
        @Override public boolean isDouble() { return false; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.TUFF_BRICK_SLAB; }
    }

    public static class Double extends TuffBrickSlab {
        @Override public boolean isDouble() { return true; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.TUFF_BRICK_SLAB; }
    }
}
