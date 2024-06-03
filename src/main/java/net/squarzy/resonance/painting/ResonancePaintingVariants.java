package net.squarzy.resonance.painting;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;


public class ResonancePaintingVariants {
    public static DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(Registries.PAINTING_VARIANT, Resonance.MOD_ID);

    public static RegistryObject<PaintingVariant> HALL = PAINTINGS.register("hall", () -> new PaintingVariant(16,16));
    public static RegistryObject<PaintingVariant> W96 = PAINTINGS.register("w96", () -> new PaintingVariant(64,64));
    public static RegistryObject<PaintingVariant> MAZE = PAINTINGS.register("maze", () -> new PaintingVariant(32,48));
    public static RegistryObject<PaintingVariant> LIMBO = PAINTINGS.register("limbo", () -> new PaintingVariant(32,32 ));
    public static RegistryObject<PaintingVariant> LOUNGE = PAINTINGS.register("lounge", () -> new PaintingVariant(32,32 ));
    public static RegistryObject<PaintingVariant> OBLIVION = PAINTINGS.register("oblivion", () -> new PaintingVariant(32,32 ));
    public static RegistryObject<PaintingVariant> LOON_GARDEN = PAINTINGS.register("loon_garden", () -> new PaintingVariant(64,48 ));
    public static RegistryObject<PaintingVariant> CONE_ISLAND = PAINTINGS.register("cone_island", () -> new PaintingVariant(64,64 ));
    public static RegistryObject<PaintingVariant> OFFICE_DAY = PAINTINGS.register("office_day", () -> new PaintingVariant(80,64 ));
    public static RegistryObject<PaintingVariant> DAY_OUT  = PAINTINGS.register("day_out", () -> new PaintingVariant(64,64 ));
    public static RegistryObject<PaintingVariant> WEVE_BEEN_OKAY = PAINTINGS.register("weve_been_okay", () -> new PaintingVariant(64, 64));
    public static RegistryObject<PaintingVariant> DISC = PAINTINGS.register("disc", () -> new PaintingVariant(64, 64));
    public static RegistryObject<PaintingVariant> FLOATING_SPHERES = PAINTINGS.register("floating_spheres", () -> new PaintingVariant(96, 64));

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }
}
