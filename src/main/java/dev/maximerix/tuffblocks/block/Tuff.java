package dev.maximerix.tuffblocks.block;

import dev.maximerix.tuffblocks.init.TuffSoundTypes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class Tuff extends Block {
    public Tuff() {
        super(Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
                .sound(TuffSoundTypes.TUFF)
                .strength(1.5f, 6f)
                .requiresCorrectToolForDrops()
        );
    }
}