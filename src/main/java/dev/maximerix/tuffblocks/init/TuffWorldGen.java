package dev.maximerix.tuffblocks.init;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class TuffWorldGen implements IWorldGenerator {

    private final WorldGenMinable tuffGen;

    public TuffWorldGen() {
        this.tuffGen = new WorldGenMinable(TuffBlocks.TUFF.getDefaultState(), 30);
    }

    @Override
    public void generate(Random rand, int chunkX, int chunkZ,
                         World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {

        if (world.provider.getDimension() != 0) return;

        for (int i = 0; i < 3; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = rand.nextInt(20);
            int z = chunkZ * 16 + rand.nextInt(16);
            tuffGen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}