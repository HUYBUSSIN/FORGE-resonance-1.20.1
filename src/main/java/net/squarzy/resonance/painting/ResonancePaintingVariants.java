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
    public static RegistryObject<PaintingVariant> YES_DA_DA_DA = PAINTINGS.register("yes_da_da_da", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> ONE_NINE_NINE_NINE_NINE = PAINTINGS.register("19999", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> NEW_TWILIGHT = PAINTINGS.register("new_twilight", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> HOW_TO_SEE_THROUGH_WALLS = PAINTINGS.register("how_to_see_through_walls", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> IN_THE_WORLDE = PAINTINGS.register("in_the_worlde", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> DATED_NEW_AESTHETIC = PAINTINGS.register("dated_new_aesthetic", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> MAGIC_PEAKS = PAINTINGS.register("magic_peaks", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> EMPTY_HIDING_WORLD = PAINTINGS.register("empty_hiding_world", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> NEMATOPHY = PAINTINGS.register("nematophy", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> NOSTALGI_GAIUS = PAINTINGS.register("nostalgi_gaius", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> ONE_HUNDRED_MORNINGS = PAINTINGS.register("one_hundred_mornings", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> OPTIMIZED = PAINTINGS.register("optimized", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> PLUME_VALLEY = PAINTINGS.register("plume_valley", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> RED_TWILIGHT = PAINTINGS.register("red_twilight", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> REFLECTIONS = PAINTINGS.register("reflections", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> VISTA_OF_CHAOS = PAINTINGS.register("vista_of_chaos", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> VIBES = PAINTINGS.register("vibes", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> PALE_MEDITATIONS = PAINTINGS.register("pale_meditations", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> ACHIEVEMENT = PAINTINGS.register("achievement", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> LYNX = PAINTINGS.register("lynx", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> GLASS_PRISM = PAINTINGS.register("glass_prism", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> ENCHANTED_INSTRUMENTALS_AND_WHISPERS = PAINTINGS.register("enchanted_instrumentals_and_whispers", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> CUT_UP_SECTIONS = PAINTINGS.register("cut_up_sections", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> GRADIENT_HORIZONT = PAINTINGS.register("gradient_horizont", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> FINITE_TIME = PAINTINGS.register("finite_time", () -> new PaintingVariant(112, 112));
    public static RegistryObject<PaintingVariant> THE_FOOL = PAINTINGS.register("the_fool", () -> new PaintingVariant(48, 64));

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }
}
