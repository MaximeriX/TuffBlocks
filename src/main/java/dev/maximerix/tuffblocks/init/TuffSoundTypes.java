package dev.maximerix.tuffblocks.init;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;

public class TuffSoundTypes {
    private static class LazySoundType extends SoundType {
        private final RegistryObject<SoundEvent> breakSound;
        private final RegistryObject<SoundEvent> stepSound;
        private final RegistryObject<SoundEvent> placeSound;
        private final RegistryObject<SoundEvent> hitSound;
        private final RegistryObject<SoundEvent> fallSound;

        public LazySoundType(float volume, float pitch,
                             RegistryObject<SoundEvent> breakS,
                             RegistryObject<SoundEvent> stepS,
                             RegistryObject<SoundEvent> placeS,
                             RegistryObject<SoundEvent> hitS,
                             RegistryObject<SoundEvent> fallS) {
            super(volume, pitch,
                    SoundEvents.BLOCK_STONE_BREAK,
                    SoundEvents.BLOCK_STONE_STEP,
                    SoundEvents.BLOCK_STONE_PLACE,
                    SoundEvents.BLOCK_STONE_HIT,
                    SoundEvents.BLOCK_STONE_FALL);
            this.breakSound = breakS;
            this.stepSound = stepS;
            this.placeSound = placeS;
            this.hitSound = hitS;
            this.fallSound = fallS;
        }

        @Override public SoundEvent getBreakSound() { return breakSound.get(); }
        @Override public SoundEvent getStepSound() { return stepSound.get();  }
        @Override public SoundEvent getPlaceSound() { return placeSound.get(); }
        @Override public SoundEvent getHitSound() { return hitSound.get();   }
        @Override public SoundEvent getFallSound() { return fallSound.get();  }
    }

    public static final SoundType TUFF = new LazySoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_TUFF_BREAK,
            TuffSounds.BLOCK_TUFF_STEP,
            TuffSounds.BLOCK_TUFF_PLACE,
            TuffSounds.BLOCK_TUFF_HIT,
            TuffSounds.BLOCK_TUFF_FALL
    );

    public static final SoundType POLISHED_TUFF = new LazySoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_POLISHED_TUFF_BREAK,
            TuffSounds.BLOCK_POLISHED_TUFF_STEP,
            TuffSounds.BLOCK_POLISHED_TUFF_PLACE,
            TuffSounds.BLOCK_POLISHED_TUFF_HIT,
            TuffSounds.BLOCK_POLISHED_TUFF_FALL
    );

    public static final SoundType TUFF_BRICKS = new LazySoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_TUFF_BRICKS_BREAK,
            TuffSounds.BLOCK_TUFF_BRICKS_STEP,
            TuffSounds.BLOCK_TUFF_BRICKS_PLACE,
            TuffSounds.BLOCK_TUFF_BRICKS_HIT,
            TuffSounds.BLOCK_TUFF_BRICKS_FALL
    );
}