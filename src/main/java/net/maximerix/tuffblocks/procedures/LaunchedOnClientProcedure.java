package net.maximerix.tuffblocks.procedures;

import net.maximerix.tuffblocks.TuffBlocks;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.maximerix.tuffblocks.ElementsTuffBlocks;

@ElementsTuffBlocks.ModElement.Tag
public class LaunchedOnClientProcedure extends ElementsTuffBlocks.ModElement {
    public LaunchedOnClientProcedure(ElementsTuffBlocks instance) {
        super(instance, 16);
    }

    public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
        TuffBlocks.LOGGER.info("TuffBlocks successfully loaded on the client-side!");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void init(FMLInitializationEvent event) {
        this.executeProcedure(new java.util.HashMap<>());
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
