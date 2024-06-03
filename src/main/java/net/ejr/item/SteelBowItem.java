package net.ejr.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Predicate;

public class SteelBowItem extends BowItem {
	public SteelBowItem() {
		super(new Item.Properties().durability(300).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.fail(entity.getItemInHand(hand));
		if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
			ar = InteractionResultHolder.success(entity.getItemInHand(hand));
			entity.startUsingItem(hand);
		}
		return ar;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				Arrow projectile = new Arrow(world, entity);
				int i = this.getUseDuration(itemstack) - time;
				float f = BowItem.getPowerForTime(i);
				if ((double)f >= 0.1D) {
					if (!world.isClientSide && f == 1.0F) {
						projectile.setCritArrow(true);
					}

					// Get the power enchantment level
					int powerLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack);
					// Set the arrow damage based on the power level
					projectile.setBaseDamage(projectile.getBaseDamage() + (double)powerLevel * 0.5 + 0.5);

					projectile.shootFromRotation(entity, entity.getXRot(), entity.getYRot(), 0.0F, f * 3.0F, 1.0F);
					world.addFreshEntity(projectile);
					world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (world.getRandom().nextFloat() * 0.5f + 1));
					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
					if (player.getAbilities().instabuild) {
						projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (stack.isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), player)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									player.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								player.getInventory().removeItem(stack);
						}
					}
				}
			}
		}
	}


	private ItemStack findAmmo(Player player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == Items.ARROW);
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().items.size(); i++) {
				ItemStack teststack = player.getInventory().items.get(i);
				if (teststack != null && teststack.getItem() == Items.ARROW) {
					stack = teststack;
					break;
				}
			}
		}
		return stack;
	}


	public static float getPowerForTime(int p_40662_) {
		float f = (float)p_40662_ / 20.0F;
		f = (f * f + f * 2.0F) / 3.0F;
		if (f > 1.0F) {
			f = 1.0F;
		}

		return f;
	}

	public Predicate<ItemStack> getAllSupportedProjectiles() {
		return ARROW_ONLY;
	}

	public AbstractArrow customArrow(AbstractArrow arrow) {
		return arrow;
	}

	public int getDefaultProjectileRange() {
		return 16;
	}
	public Ingredient getRepairIngredient() {
		return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingots/steel")));
	}
}
