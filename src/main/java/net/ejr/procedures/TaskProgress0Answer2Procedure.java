package net.ejr.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.ejr.network.EjrModVariables;
import net.ejr.entity.TheAllKnowingSageEntity;
import net.ejr.EjrMod;

import java.util.List;
import java.util.Comparator;

public class TaskProgress0Answer2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress == 1.2) {
			{
				double _setval = 1.3;
				entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TaskProgress = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			EjrMod.queueServerWork(100, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheAllKnowingSageEntity) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 80, 1));
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(((entityiterator.getDisplayName().getString() + ":") + "" + Component.translatable("task_progress.0.3").getString())), false);
							EjrMod.queueServerWork(60, () -> {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.setHealth(0);
							});
						}
					}
				}
			});
		}
	}
}
