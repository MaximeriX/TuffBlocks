package net.maximerix.tuffblocks;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.util.ResourceLocation;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class TuffModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public TuffModElements() {
		sounds.put(new ResourceLocation("tuff", "block.tuff.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff.break")));
		sounds.put(new ResourceLocation("tuff", "block.tuff.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff.step")));
		sounds.put(new ResourceLocation("tuff", "block.tuff.place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff.place")));
		sounds.put(new ResourceLocation("tuff", "block.tuff.hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff.hit")));
		sounds.put(new ResourceLocation("tuff", "block.tuff.fall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff.fall")));
		sounds.put(new ResourceLocation("tuff", "block.polished_tuff.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.break")));
		sounds.put(new ResourceLocation("tuff", "block.polished_tuff.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.step")));
		sounds.put(new ResourceLocation("tuff", "block.polished_tuff.place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.place")));
		sounds.put(new ResourceLocation("tuff", "block.polished_tuff.hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.hit")));
		sounds.put(new ResourceLocation("tuff", "block.polished_tuff.fall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.polished_tuff.fall")));
		sounds.put(new ResourceLocation("tuff", "block.tuff_bricks.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.break")));
		sounds.put(new ResourceLocation("tuff", "block.tuff_bricks.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.step")));
		sounds.put(new ResourceLocation("tuff", "block.tuff_bricks.place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.place")));
		sounds.put(new ResourceLocation("tuff", "block.tuff_bricks.hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.hit")));
		sounds.put(new ResourceLocation("tuff", "block.tuff_bricks.fall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("tuff", "block.tuff_bricks.fall")));

		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("tuff").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == TuffModElements.ModElement.class)
						elements.add((TuffModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(TuffModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		TuffMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final TuffModElements elements;
		protected final int sortid;

		public ModElement(TuffModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
