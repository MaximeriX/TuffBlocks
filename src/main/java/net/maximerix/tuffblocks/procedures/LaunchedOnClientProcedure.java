package net.maximerix.tuffblocks.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.maximerix.tuffblocks.TuffMod;
import java.util.Map;
import java.util.Collections;

public class LaunchedOnClientProcedure {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void init(FMLClientSetupEvent event) {
			executeProcedure(Collections.emptyMap());
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		TuffMod.LOGGER.info("TuffBlocks successfully loaded on the client-side!");
	}
}
