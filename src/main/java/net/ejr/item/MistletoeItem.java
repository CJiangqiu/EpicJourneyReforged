package net.ejr.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;

import net.ejr.init.EjrModItems;
import net.ejr.init.EjrModMobEffects;

public class MistletoeItem extends SwordItem {
	public MistletoeItem() {
		super(new Tier() {
			public int getUses() {
				return 450;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EjrModItems.SPORE_BALL.get()));
			}
		}, 3, -2.4f, new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		if (!entity.level().isClientSide())
			entity.addEffect(new MobEffectInstance(EjrModMobEffects.SPORE_PARASITISM.get(), 60, 2));
		return retval;
	}
}
