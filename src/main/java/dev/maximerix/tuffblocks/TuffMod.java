package dev.maximerix.tuffblocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dev.maximerix.tuffblocks.init.*;

@Mod(TuffMod.MODID)
public class TuffMod {
	public static final String MODID = "tuff";
	public static final Logger LOGGER = LogManager.getLogger("TuffBlocks");

	public TuffMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		TuffSounds.REGISTRY.register(bus);
		TuffBlocks.REGISTRY.register(bus);
		TuffItems.REGISTRY.register(bus);

		bus.addListener(this::commonSetup);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
		LOGGER.info("TuffBlocks fully loaded and ready to tuff up your world! :D");
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MODID, path);
	}
}