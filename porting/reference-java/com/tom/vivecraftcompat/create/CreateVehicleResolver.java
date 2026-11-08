package com.tom.vivecraftcompat.create;
import java.lang.reflect.Method;
/** Reconstructed from v3.4.3 class bytecode. Reference only; not wired into build. */
public final class CreateVehicleResolver {
    private static volatile Class<?> contraptionType;
    private static volatile Method getVehicleMethod;
    private CreateVehicleResolver() {}
    public static Object find(Object entity) {
        if (entity == null) return null;
        try {
            Class<?> type = contraptionType;
            if (type == null) {
                type = Class.forName("com.simibubi.create.content.contraptions.AbstractContraptionEntity");
                contraptionType = type;
            }
            Method vehicle = getVehicleMethod;
            if (vehicle == null) {
                vehicle = Class.forName("net.minecraft.world.entity.Entity").getMethod("getVehicle");
                getVehicleMethod = vehicle;
            }
            Object cursor = entity;
            for (int depth = 0; depth < 6; depth++) {
                cursor = vehicle.invoke(cursor);
                if (cursor == null) return null;
                if (type.isInstance(cursor)) return cursor;
            }
        } catch (ReflectiveOperationException | IllegalArgumentException ignored) {}
        return null;
    }
}