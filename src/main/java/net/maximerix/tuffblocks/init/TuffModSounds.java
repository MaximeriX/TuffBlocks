package net.maximerix.tuffblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff.break"), new SoundEvent(new ResourceLocation("tuff", "block.tuff.break")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff.place"), new SoundEvent(new ResourceLocation("tuff", "block.tuff.place")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff.hit"), new SoundEvent(new ResourceLocation("tuff", "block.tuff.hit")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff.fall"), new SoundEvent(new ResourceLocation("tuff", "block.tuff.fall")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff.step"), new SoundEvent(new ResourceLocation("tuff", "block.tuff.step")));
		REGISTRY.put(new ResourceLocation("tuff", "block.polished_tuff.break"), new SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.break")));
		REGISTRY.put(new ResourceLocation("tuff", "block.polished_tuff.place"), new SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.place")));
		REGISTRY.put(new ResourceLocation("tuff", "block.polished_tuff.hit"), new SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.hit")));
		REGISTRY.put(new ResourceLocation("tuff", "block.polished_tuff.fall"), new SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.fall")));
		REGISTRY.put(new ResourceLocation("tuff", "block.polished_tuff.step"), new SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.step")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff_bricks.break"), new SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.break")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff_bricks.place"), new SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.place")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff_bricks.hit"), new SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.hit")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff_bricks.fall"), new SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.fall")));
		REGISTRY.put(new ResourceLocation("tuff", "block.tuff_bricks.step"), new SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.step")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
