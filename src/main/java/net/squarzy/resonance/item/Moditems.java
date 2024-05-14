package net.squarzy.resonance.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.sound.Modsounds;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Resonance.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_YES_DA_DA_DA = ITEMS.register( "music_disc_yes_da_da_da",
            () -> new RecordItem(6 , Modsounds.IRREAL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_19999 = ITEMS.register( "music_disc_19999",
            () -> new RecordItem(6 , Modsounds.NEW_REALIZATION, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NEW_TWILIGHT = ITEMS.register( "music_disc_new_twilight",
            () -> new RecordItem(6 , Modsounds.XASD, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DATED_NEW_AESTHETICS = ITEMS.register( "music_disc_dated_new_aesthetics",
            () -> new RecordItem(6 , Modsounds.NOME_DA_MUSICA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HOW_TO_SEE_THROUGH_WALLS = ITEMS.register( "music_disc_how_to_see_through_walls",
            () -> new RecordItem(6 , Modsounds.WAY_WAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_EMPTY_HIDING_WORLD = ITEMS.register( "music_disc_empty_hiding_world",
            () -> new RecordItem(6 , Modsounds.EDENIC_GREEN_PLUS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MAGIC_PEAKS = ITEMS.register( "music_disc_magic_peaks",
            () -> new RecordItem(6 , Modsounds.LOOKING_FORWARD, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_RED_TWILIGHT = ITEMS.register( "music_disc_red_twilight",
            () -> new RecordItem(6 , Modsounds.IN_BETWEEN_YEARS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_IN_THE_WORLDE = ITEMS.register( "music_disc_in_the_worlde",
            () -> new RecordItem(6 , Modsounds.HEALS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_GLASS_PRISM = ITEMS.register( "music_disc_glass_prism",
            () -> new RecordItem(6 , Modsounds.GLASS_PRISM, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ENCHANTED_INSTRUMENTALS_AND_WHISPERS= ITEMS.register( "music_disc_enchanted_instrumentals_and_whispers",
            () -> new RecordItem(6 , Modsounds.HELLO_EARTH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ONE_HUNDRED_MORNINGS= ITEMS.register( "music_disc_one_hundred_mornings",
            () -> new RecordItem(6 , Modsounds.CALIGULA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NOSTAlGI_GAIUS= ITEMS.register( "music_disc_nostalgi_gaius",
            () -> new RecordItem(6 , Modsounds.FINE_YOU, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_GRADIENT_HORIZONT= ITEMS.register( "music_disc_gradient_horizont",
            () -> new RecordItem(6 , Modsounds.A_CRY_IN_THE_DISTANCE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_OPTIMIZED= ITEMS.register( "music_disc_optimized",
            () -> new RecordItem(6 , Modsounds.CHROME, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PLUME_VALLEY= ITEMS.register( "music_disc_plume_valley",
            () -> new RecordItem(6 , Modsounds.TRANQUILITY_PATH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PALE_MEDITATIONS= ITEMS.register( "music_disc_pale_meditations",
            () -> new RecordItem(6 , Modsounds.CHIC_SOLITUDE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_VISTA_OF_CHAOS= ITEMS.register( "music_disc_vista_of_chaos",
            () -> new RecordItem(6 , Modsounds.AERODYNAMIC_DISSEMINATION, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_REFLECTIONS= ITEMS.register( "music_disc_reflections",
            () -> new RecordItem(6 , Modsounds.DRIVE_SLOW, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NEMATOPHY= ITEMS.register( "music_disc_nematophy",
            () -> new RecordItem(6 , Modsounds.AQUA_PURA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_VIBES= ITEMS.register( "music_disc_vibes",
            () -> new RecordItem(6 , Modsounds.A_NEW_DAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_FINITE_TIME= ITEMS.register( "music_disc_finite_time",
            () -> new RecordItem(6 , Modsounds.FINITE_TIME, new Item.Properties(). stacksTo(1), 44100));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
