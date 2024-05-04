
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
}
