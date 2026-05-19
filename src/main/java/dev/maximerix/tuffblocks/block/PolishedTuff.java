package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class PolishedTuff extends Block {

    public PolishedTuff() {
        super(Material.ROCK, MapColor.GRAY_STAINED_HARDENED_CLAY);
        setSoundType(TuffSoundTypes.POLISHED_TUFF);
        setHardness(1.5f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 0);
    }
}
