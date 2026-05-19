package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ChiseledTuff extends Block {
    public ChiseledTuff() {
        super(Material.ROCK, MapColor.STONE);
        setSoundType(TuffSoundTypes.TUFF);
        setHardness(1.5f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 0);
    }
}
