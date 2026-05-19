package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffBlocks;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;

public abstract class PolishedTuffSlab extends AbstractTuffSlab {
    protected PolishedTuffSlab() {
        super(TuffSoundTypes.POLISHED_TUFF, MapColor.GRAY_STAINED_HARDENED_CLAY);
    }

    public static class Half extends PolishedTuffSlab {
        @Override public boolean isDouble() { return false; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.POLISHED_TUFF_SLAB; }
    }

    public static class Double extends PolishedTuffSlab {
        @Override public boolean isDouble() { return true; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.POLISHED_TUFF_SLAB; }
    }
}
