package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TuffMod.MODID)
public class TuffSounds {

    public static SoundEvent BLOCK_TUFF_BREAK;
    public static SoundEvent BLOCK_TUFF_PLACE;
    public static SoundEvent BLOCK_TUFF_HIT;
    public static SoundEvent BLOCK_TUFF_FALL;
    public static SoundEvent BLOCK_TUFF_STEP;

    public static SoundEvent BLOCK_POLISHED_TUFF_BREAK;
    public static SoundEvent BLOCK_POLISHED_TUFF_PLACE;
    public static SoundEvent BLOCK_POLISHED_TUFF_HIT;
    public static SoundEvent BLOCK_POLISHED_TUFF_FALL;
    public static SoundEvent BLOCK_POLISHED_TUFF_STEP;

    public static SoundEvent BLOCK_TUFF_BRICKS_BREAK;
    public static SoundEvent BLOCK_TUFF_BRICKS_PLACE;
    public static SoundEvent BLOCK_TUFF_BRICKS_HIT;
    public static SoundEvent BLOCK_TUFF_BRICKS_FALL;
    public static SoundEvent BLOCK_TUFF_BRICKS_STEP;

    @SubscribeEvent
    public static void register(RegistryEvent.Register<SoundEvent> event) {
        BLOCK_TUFF_BREAK  = reg(event, "block.tuff.break");
        BLOCK_TUFF_PLACE  = reg(event, "block.tuff.place");
        BLOCK_TUFF_HIT    = reg(event, "block.tuff.hit");
        BLOCK_TUFF_FALL   = reg(event, "block.tuff.fall");
        BLOCK_TUFF_STEP   = reg(event, "block.tuff.step");

        BLOCK_POLISHED_TUFF_BREAK = reg(event, "block.polished_tuff.break");
        BLOCK_POLISHED_TUFF_PLACE = reg(event, "block.polished_tuff.place");
        BLOCK_POLISHED_TUFF_HIT   = reg(event, "block.polished_tuff.hit");
        BLOCK_POLISHED_TUFF_FALL  = reg(event, "block.polished_tuff.fall");
        BLOCK_POLISHED_TUFF_STEP  = reg(event, "block.polished_tuff.step");

        BLOCK_TUFF_BRICKS_BREAK = reg(event, "block.tuff_bricks.break");
        BLOCK_TUFF_BRICKS_PLACE = reg(event, "block.tuff_bricks.place");
        BLOCK_TUFF_BRICKS_HIT   = reg(event, "block.tuff_bricks.hit");
        BLOCK_TUFF_BRICKS_FALL  = reg(event, "block.tuff_bricks.fall");
        BLOCK_TUFF_BRICKS_STEP  = reg(event, "block.tuff_bricks.step");
    }

    private static SoundEvent reg(RegistryEvent.Register<SoundEvent> event, String name) {
        ResourceLocation rl = TuffMod.id(name);
        SoundEvent sound = new SoundEvent(rl);
        sound.setRegistryName(rl);
        event.getRegistry().register(sound);
        return sound;
    }
}
