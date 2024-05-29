
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ejr.EjrMod;

public class EjrModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EjrMod.MODID);
	public static final RegistryObject<SoundEvent> THE_LOST_LIVE = REGISTRY.register("the_lost_live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_lost_live")));
	public static final RegistryObject<SoundEvent> THE_LOST_HURT = REGISTRY.register("the_lost_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_lost_hurt")));
	public static final RegistryObject<SoundEvent> THE_LOST_DEATH = REGISTRY.register("the_lost_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_lost_death")));
	public static final RegistryObject<SoundEvent> THE_ALL_KNOWING_SAGE_LIVE = REGISTRY.register("the_all_knowing_sage_live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_all_knowing_sage_live")));
	public static final RegistryObject<SoundEvent> THE_ALL_KNOWING_SAGE_HURT = REGISTRY.register("the_all_knowing_sage_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_all_knowing_sage_hurt")));
	public static final RegistryObject<SoundEvent> THE_ALL_KNOWING_SAGE_DEATH = REGISTRY.register("the_all_knowing_sage_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_all_knowing_sage_death")));
	public static final RegistryObject<SoundEvent> WAKE_UP = REGISTRY.register("wake_up", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "wake_up")));
	public static final RegistryObject<SoundEvent> EPIC_JOURNEY = REGISTRY.register("epic_journey", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "epic_journey")));
	public static final RegistryObject<SoundEvent> IN_THE_JOURNEY = REGISTRY.register("in_the_journey", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "in_the_journey")));
	public static final RegistryObject<SoundEvent> JOURNEY_BEGIN = REGISTRY.register("journey_begin", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "journey_begin")));
	public static final RegistryObject<SoundEvent> BY_THE_CAMPFIRE = REGISTRY.register("by_the_campfire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "by_the_campfire")));
	public static final RegistryObject<SoundEvent> THE_GOD_OF_FAKE = REGISTRY.register("the_god_of_fake", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "the_god_of_fake")));
	public static final RegistryObject<SoundEvent> WOLF_KNIGHT_OF_THE_MOON = REGISTRY.register("wolf_knight_of_the_moon", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ejr", "wolf_knight_of_the_moon")));
}
