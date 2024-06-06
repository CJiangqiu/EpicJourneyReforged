
package net.ejr.procedures;

import io.netty.buffer.Unpooled;
import net.ejr.world.inventory.TalkingGuiMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.network.NetworkHooks;

import java.util.UUID;

public class RightClickNpcProcedure {
	private static UUID lastEntityUUID = null;

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity TalkingEntity = null;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 255));
		if (sourceentity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			NetworkHooks.openScreen(_ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("TalkingGui");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new TalkingGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
		lastEntityUUID = entity.getUUID();
	}

	public static Entity getTalkingEntity(LevelAccessor world) {
		if (lastEntityUUID == null) {
			return null;
		}
		if (world instanceof ServerLevel) {
			return ((ServerLevel) world).getEntity(lastEntityUUID);
		}
		return null;
	}
}
