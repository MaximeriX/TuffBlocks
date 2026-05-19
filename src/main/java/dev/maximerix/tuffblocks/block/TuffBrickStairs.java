package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

public class TuffBrickStairs extends BlockStairs {
    public TuffBrickStairs() {
        super(Blocks.STONE.getDefaultState());
        setSoundType(TuffSoundTypes.TUFF_BRICKS);
        setHardness(1.5f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 0);
        setLightOpacity(0);
        useNeighborBrightness = true;
    }
}
