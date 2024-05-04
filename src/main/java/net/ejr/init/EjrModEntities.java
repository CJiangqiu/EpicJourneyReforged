
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ejr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.ejr.entity.TheLostEntity;
import net.ejr.entity.TheAllKnowingSageEntity;
import net.ejr.entity.DeadImperialSoldierEntity;
import net.ejr.EjrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EjrModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EjrMod.MODID);
	public static final RegistryObject<EntityType<TheLostEntity>> THE_LOST = register("the_lost",
			EntityType.Builder.<TheLostEntity>of(TheLostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(TheLostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeadImperialSoldierEntity>> DEAD_IMPERIAL_SOLDIER = register("dead_imperial_soldier",
			EntityType.Builder.<DeadImperialSoldierEntity>of(DeadImperialSoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeadImperialSoldierEntity::new)

					.sized(0.6f, 1.1f));
	public static final RegistryObject<EntityType<TheAllKnowingSageEntity>> THE_ALL_KNOWING_SAGE = register("the_all_knowing_sage", EntityType.Builder.<TheAllKnowingSageEntity>of(TheAllKnowingSageEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheAllKnowingSageEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheLostEntity.init();
			DeadImperialSoldierEntity.init();
			TheAllKnowingSageEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THE_LOST.get(), TheLostEntity.createAttributes().build());
		event.put(DEAD_IMPERIAL_SOLDIER.get(), DeadImperialSoldierEntity.createAttributes().build());
		event.put(THE_ALL_KNOWING_SAGE.get(), TheAllKnowingSageEntity.createAttributes().build());
	}
}
