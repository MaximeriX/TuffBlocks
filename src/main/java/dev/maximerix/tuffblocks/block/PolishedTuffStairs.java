package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

public class PolishedTuffStairs extends BlockStairs {
    public PolishedTuffStairs() {
        super(Blocks.STONE.getDefaultState());
        setSoundType(TuffSoundTypes.POLISHED_TUFF);
        setHardness(1.5f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 0);
        setLightOpacity(0);
        useNeighborBrightness = true;
    }
}
