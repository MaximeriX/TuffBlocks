package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffBlocks;
import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;

public abstract class TuffSlab extends AbstractTuffSlab {
    protected TuffSlab() {
        super(TuffSoundTypes.TUFF, MapColor.STONE);
    }

    public static class Half extends TuffSlab {
        @Override public boolean isDouble() { return false; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.TUFF_SLAB; }
    }

    public static class Double extends TuffSlab {
        @Override public boolean isDouble() { return true; }
        @Override protected BlockSlab getSingleSlab() { return (BlockSlab) TuffBlocks.TUFF_SLAB; }
    }
}
