
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.ejr.potion.SporeParasitismMobEffect;
import net.ejr.EjrMod;

public class EjrModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EjrMod.MODID);
	public static final RegistryObject<MobEffect> SPORE_PARASITISM = REGISTRY.register("spore_parasitism", () -> new SporeParasitismMobEffect());
}
