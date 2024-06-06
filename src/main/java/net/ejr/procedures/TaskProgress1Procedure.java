package net.ejr.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.levelgen.Heightmap;

import net.ejr.network.EjrModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TaskProgress1Procedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EjrModVariables.PlayerVariables())).TaskProgress < 2) {
            BlockPos pos = new BlockPos((int)Math.floor(x), (int)Math.floor(y), (int)Math.floor(z));
            if (world.getBiome(pos).is(new ResourceLocation("ejr:fick_forvoss"))) {
                BlockPos newPos;
                do {
                    int offsetX = (int) (Math.random() * 65) - 32;
                    int offsetZ = (int) (Math.random() * 65) - 32;
                    newPos = pos.offset(offsetX, 0, offsetZ);
                    newPos = world.getHeightmapPos(Heightmap.Types.WORLD_SURFACE, newPos);
                } while (!world.getBiome(newPos).is(new ResourceLocation("ejr:fick_forvoss")) || !world.getBlockState(newPos.below()).isSolid());
                pos = newPos;
                if (world instanceof ServerLevel _serverworld) {
                    StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ejr", "the_final_message"));
                    if (template != null) {
                        Vec3i templateSizeVec = template.getSize();
                        BlockPos templateSize = new BlockPos(templateSizeVec.getX(), templateSizeVec.getY(), templateSizeVec.getZ());
                        template.placeInWorld(_serverworld, pos, templateSize,
                                new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 2);
                        //Store the Location.
                        final BlockPos finalPos = pos;
                        entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                            capability.TaskProgressLocationX = finalPos.getX();
                            capability.TaskProgressLocationY = finalPos.getY();
                            capability.TaskProgressLocationZ = finalPos.getZ();
                            capability.syncPlayerVariables(entity);
                        });
                    }
                }
                {
                    double _setval = 2;
                    entity.getCapability(EjrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.TaskProgress = _setval;
                        capability.syncPlayerVariables(entity);
                    });
                }
            }
        }
    }
}
