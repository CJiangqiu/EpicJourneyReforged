package net.ejr.procedures;

import net.ejr.entity.WolfKnightOfTheMoonEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;
import java.util.List;

public class DashAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double coordinate_x = 0;
		double coordinate_y = 0;
		double coordinate_z = 0;
		coordinate_x = entity.getX();
		coordinate_y = entity.getY();
		coordinate_z = entity.getZ();
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), _ent.getYRot(), _ent.getXRot());
		}
		{
			final Vec3 _center = new Vec3((entity.getX() - coordinate_x), (entity.getY() - coordinate_y), (entity.getZ() - coordinate_z));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity instanceof WolfKnightOfTheMoonEntity)) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
							(float) (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue() * 1.5));
				}
			}
		}
	}
}
