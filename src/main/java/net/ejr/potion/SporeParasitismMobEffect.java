package net.ejr.potion;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SporeParasitismMobEffect extends MobEffect {
	public SporeParasitismMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342388);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		if (entity != null) {
			float damage = (amplifier + 1) * 0.1f;
			entity.hurt(new DamageSource(entity.getCommandSenderWorld().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), damage);
		}
	}
}
