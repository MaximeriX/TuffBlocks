package dev.maximerix.tuffblocks;

import dev.maximerix.tuffblocks.init.TuffWorldGen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TuffMod.MODID, name = "TuffBlocks", version = TuffMod.VERSION,
        acceptedMinecraftVersions = "[1.12,1.13)")
public class TuffMod {

    public static final String MODID = "tuff";
    public static final String VERSION = "1.1-1.12.2";
    public static final Logger LOGGER = LogManager.getLogger("TuffBlocks");

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new TuffWorldGen(), 0);
        LOGGER.info("TuffBlocks fully loaded and ready to tuff up your world! :D");
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }
}
