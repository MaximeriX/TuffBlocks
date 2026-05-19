package dev.maximerix.tuffblocks.init;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvent;
import java.util.function.Supplier;

public final class TuffSoundTypes {

    public static final SoundType TUFF = new LazySoundType(
            () -> TuffSounds.BLOCK_TUFF_BREAK,
            () -> TuffSounds.BLOCK_TUFF_STEP,
            () -> TuffSounds.BLOCK_TUFF_PLACE,
            () -> TuffSounds.BLOCK_TUFF_HIT,
            () -> TuffSounds.BLOCK_TUFF_FALL);

    public static final SoundType POLISHED_TUFF = new LazySoundType(
            () -> TuffSounds.BLOCK_POLISHED_TUFF_BREAK,
            () -> TuffSounds.BLOCK_POLISHED_TUFF_STEP,
            () -> TuffSounds.BLOCK_POLISHED_TUFF_PLACE,
            () -> TuffSounds.BLOCK_POLISHED_TUFF_HIT,
            () -> TuffSounds.BLOCK_POLISHED_TUFF_FALL);

    public static final SoundType TUFF_BRICKS = new LazySoundType(
            () -> TuffSounds.BLOCK_TUFF_BRICKS_BREAK,
            () -> TuffSounds.BLOCK_TUFF_BRICKS_STEP,
            () -> TuffSounds.BLOCK_TUFF_BRICKS_PLACE,
            () -> TuffSounds.BLOCK_TUFF_BRICKS_HIT,
            () -> TuffSounds.BLOCK_TUFF_BRICKS_FALL);

    public static void init() {}

    private TuffSoundTypes() {}

    private static class LazySoundType extends SoundType {
        private final Supplier<SoundEvent> breakSound;
        private final Supplier<SoundEvent> stepSound;
        private final Supplier<SoundEvent> placeSound;
        private final Supplier<SoundEvent> hitSound;
        private final Supplier<SoundEvent> fallSound;

        private LazySoundType(Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound,
                              Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound,
                              Supplier<SoundEvent> fallSound) {
            super(1.0f, 1.0f,
                    SoundType.STONE.getBreakSound(),
                    SoundType.STONE.getStepSound(),
                    SoundType.STONE.getPlaceSound(),
                    SoundType.STONE.getHitSound(),
                    SoundType.STONE.getFallSound());
            this.breakSound = breakSound;
            this.stepSound = stepSound;
            this.placeSound = placeSound;
            this.hitSound = hitSound;
            this.fallSound = fallSound;
        }

        @Override
        public SoundEvent getBreakSound() {
            return orStone(breakSound.get(), SoundType.STONE.getBreakSound());
        }

        @Override
        public SoundEvent getStepSound() {
            return orStone(stepSound.get(), SoundType.STONE.getStepSound());
        }

        @Override
        public SoundEvent getPlaceSound() {
            return orStone(placeSound.get(), SoundType.STONE.getPlaceSound());
        }

        @Override
        public SoundEvent getHitSound() {
            return orStone(hitSound.get(), SoundType.STONE.getHitSound());
        }

        @Override
        public SoundEvent getFallSound() {
            return orStone(fallSound.get(), SoundType.STONE.getFallSound());
        }

        private SoundEvent orStone(SoundEvent custom, SoundEvent fallback) {
            return custom == null ? fallback : custom;
        }
    }
}