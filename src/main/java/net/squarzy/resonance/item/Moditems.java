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

    public static final RegistryObject<Item> MUSIC_DISC_IRREAL = ITEMS.register( "music_disc_irreal",
            () -> new RecordItem(6 , Modsounds.IRREAL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SPACE_PINBALL = ITEMS.register( "music_disc_space_pinball",
            () -> new RecordItem(6 , Modsounds.SPACE_PINBALL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNDERWATER_WERE_OKAY = ITEMS.register( "music_disc_underwater_were_okay",
            () -> new RecordItem(6 , Modsounds.UNDERWATER_WERE_OKAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NEW_REALIZATION = ITEMS.register( "music_disc_new_realization",
            () -> new RecordItem(6 , Modsounds.NEW_REALIZATION, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NEVERMIND = ITEMS.register( "music_disc_nevermind",
            () -> new RecordItem(6 , Modsounds.NEVERMIND, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SYNTHLINE = ITEMS.register( "music_disc_synthline",
            () -> new RecordItem(6 , Modsounds.SYNTHLINE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_XASD = ITEMS.register( "music_disc_xasd",
            () -> new RecordItem(6 , Modsounds.XASD, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CHRONOLOGY = ITEMS.register( "music_disc_chronology",
            () -> new RecordItem(6 , Modsounds.CHRONOLOGY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PINWHEEL = ITEMS.register( "music_disc_pinwheel",
            () -> new RecordItem(6 , Modsounds.PINWHEEL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NOME_DA_MUSICA = ITEMS.register( "music_disc_nome_da_musica",
            () -> new RecordItem(6 , Modsounds.NOME_DA_MUSICA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TAKEAGUESS = ITEMS.register( "music_disc_takeaguess",
            () -> new RecordItem(6 , Modsounds.TAKEAGUESS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE = ITEMS.register( "music_disc_how_he_found_the_world_all_strange_and_the_world_found_him_strange_likewise",
            () -> new RecordItem(6 , Modsounds.HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_WAY_WAY = ITEMS.register( "music_disc_way_way",
            () -> new RecordItem(6 , Modsounds.WAY_WAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_WHOS_COUNTING_THE_DAYS = ITEMS.register( "music_disc_whos_counting_the_days",
            () -> new RecordItem(6 , Modsounds.WHOS_COUNTING_THE_DAYS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_I_THINK_ITS_OVER = ITEMS.register( "music_disc_i_think_its_over",
            () -> new RecordItem(6 , Modsounds.I_THINK_ITS_OVER, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_EDENIC_GREEN_PLUS = ITEMS.register( "music_disc_edenic_green_plus",
            () -> new RecordItem(6 , Modsounds.EDENIC_GREEN_PLUS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CRYSTALLINE = ITEMS.register( "music_disc_crystalline",
            () -> new RecordItem(6 , Modsounds.CRYSTALLINE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ROULETTE = ITEMS.register( "music_disc_roulette",
            () -> new RecordItem(6 , Modsounds.ROULETTE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_LOOKING_FORWARD = ITEMS.register( "music_disc_looking_forward",
            () -> new RecordItem(6 , Modsounds.LOOKING_FORWARD, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SKYSAIL = ITEMS.register( "music_disc_skysail",
            () -> new RecordItem(6 , Modsounds.SKYSAIL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DISCOVERY = ITEMS.register( "music_disc_discovery",
            () -> new RecordItem(6 , Modsounds.DISCOVERY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_IN_BETWEEN_YEARS = ITEMS.register( "music_disc_in_between_years",
            () -> new RecordItem(6 , Modsounds.IN_BETWEEN_YEARS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DRIFTER = ITEMS.register( "music_disc_drifter",
            () -> new RecordItem(6 , Modsounds.DRIFTER, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_THER = ITEMS.register( "music_disc_ther",
            () -> new RecordItem(6 , Modsounds.THER, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HEALS = ITEMS.register( "music_disc_heals",
            () -> new RecordItem(6 , Modsounds.HEALS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_STAR_LEVEL_II = ITEMS.register( "music_disc_star_level_ii",
            () -> new RecordItem(6 , Modsounds.STAR_LEVEL_II, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_STAR_LEVEL = ITEMS.register( "music_disc_star_level",
            () -> new RecordItem(6 , Modsounds.STAR_LEVEL, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_GLASS_PRISM = ITEMS.register( "music_disc_glass_prism",
            () -> new RecordItem(6 , Modsounds.GLASS_PRISM, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNDERWATER = ITEMS.register( "music_disc_underwater",
            () -> new RecordItem(6 , Modsounds.UNDERWATER, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_I_SWEAR = ITEMS.register( "music_disc_i_swear",
            () -> new RecordItem(6 , Modsounds.I_SWEAR, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HELLO_EARTH= ITEMS.register( "music_disc_hello_earth",
            () -> new RecordItem(6 , Modsounds.HELLO_EARTH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HAZY_TRIP= ITEMS.register( "music_disc_hazy_trip",
            () -> new RecordItem(6 , Modsounds.HAZY_TRIP, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HYPNOSIS= ITEMS.register( "music_disc_hypnosis",
            () -> new RecordItem(6 , Modsounds.HYPNOSIS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CALIGULA= ITEMS.register( "music_disc_caligula",
            () -> new RecordItem(6 , Modsounds.CALIGULA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_BLISS= ITEMS.register( "music_disc_bliss",
            () -> new RecordItem(6 , Modsounds.BLISS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MIND_MIRAGE= ITEMS.register( "music_disc_mind_mirage",
            () -> new RecordItem(6 , Modsounds.MIND_MIRAGE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_FINE_YOU= ITEMS.register( "music_disc_fine_you",
            () -> new RecordItem(6 , Modsounds.FINE_YOU, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PUNCH_YOUR_FACE= ITEMS.register( "music_disc_punch_your_face",
            () -> new RecordItem(6 , Modsounds.PUNCH_YOUR_FACE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_LOST_AND_LOST= ITEMS.register( "music_disc_lost_and_lost",
            () -> new RecordItem(6 , Modsounds.LOST_AND_LOST, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_A_CRY_IN_THE_DISTANCE= ITEMS.register( "music_disc_a_cry_in_the_distance",
            () -> new RecordItem(6 , Modsounds.A_CRY_IN_THE_DISTANCE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_EARTHBOUND= ITEMS.register( "music_disc_earthbound",
            () -> new RecordItem(6 , Modsounds.EARTHBOUND, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TRANSIENT_FEELING= ITEMS.register( "music_disc_transient_feeling",
            () -> new RecordItem(6 , Modsounds.TRANSIENT_FEELING, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CHROME= ITEMS.register( "music_disc_chrome",
            () -> new RecordItem(6 , Modsounds.CHROME, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNCONSIOUS_RECOLLECTS_II= ITEMS.register( "music_disc_unconsious_recollects_ii",
            () -> new RecordItem(6 , Modsounds.UNCONSIOUS_RECOLLECTS_II, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MIZUMI= ITEMS.register( "music_disc_mizumi",
            () -> new RecordItem(6 , Modsounds.MIZUMI, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TRANQUILITY_PATH= ITEMS.register( "music_disc_tranquility_path",
            () -> new RecordItem(6 , Modsounds.TRANQUILITY_PATH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ARCADIA_TOWN= ITEMS.register( "music_disc_arcadia_town",
            () -> new RecordItem(6 , Modsounds.ARCADIA_TOWN, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DREAM_PORT= ITEMS.register( "music_disc_dream_port",
            () -> new RecordItem(6 , Modsounds.DREAM_PORT, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CHIC_SOLITUDE= ITEMS.register( "music_disc_chic_solitude",
            () -> new RecordItem(6 , Modsounds.CHIC_SOLITUDE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SUPERFICIALISM= ITEMS.register( "music_disc_superficialism",
            () -> new RecordItem(6 , Modsounds.SUPERFICIALISM, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SEEKING_TRUTH= ITEMS.register( "music_disc_seeking_truth",
            () -> new RecordItem(6 , Modsounds.SEEKING_TRUTH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_AERODYNAMIC_DISSEMINATION= ITEMS.register( "music_disc_aerodynamic_dissemination",
            () -> new RecordItem(6 , Modsounds.AERODYNAMIC_DISSEMINATION, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNIT_1644= ITEMS.register( "music_disc_unit_1644",
            () -> new RecordItem(6 , Modsounds.UNIT_1644, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TMIASFOR_CREEP= ITEMS.register( "music_disc_tmiasfor_creep",
            () -> new RecordItem(6 , Modsounds.TMIASFOR_CREEP, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DRIVE_SLOW= ITEMS.register( "music_disc_drive_slow",
            () -> new RecordItem(6 , Modsounds.DRIVE_SLOW, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NO_FUTURE= ITEMS.register( "music_disc_no_future",
            () -> new RecordItem(6 , Modsounds.NO_FUTURE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ARE_YOU_SAD_ENOUGH= ITEMS.register( "music_disc_are_you_sad_enough",
            () -> new RecordItem(6 , Modsounds.ARE_YOU_SAD_ENOUGH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_AQUA_PURA= ITEMS.register( "music_disc_aqua_pura",
            () -> new RecordItem(6 , Modsounds.AQUA_PURA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_U_KNOW= ITEMS.register( "music_disc_u_know",
            () -> new RecordItem(6 , Modsounds.U_KNOW, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SEGA= ITEMS.register( "music_disc_sega",
            () -> new RecordItem(6 , Modsounds.SEGA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_A_NEW_DAY= ITEMS.register( "music_disc_a_new_day",
            () -> new RecordItem(6 , Modsounds.A_NEW_DAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_RED_SKIES= ITEMS.register( "music_disc_red_skies",
            () -> new RecordItem(6 , Modsounds.RED_SKIES, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ANOTHER_DAY= ITEMS.register( "music_disc_another_day",
            () -> new RecordItem(6 , Modsounds.ANOTHER_DAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ALL_I_WANT= ITEMS.register( "music_disc_all_i_want",
            () -> new RecordItem( 6, Modsounds.ALL_I_WANT, new Item.Properties().stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_REFRESH_SQUEEZED= ITEMS.register( "music_disc_refresh_squeezed",
            () -> new RecordItem( 6, Modsounds.REFRESH_SQUEEZED, new Item.Properties().stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_FINITE_TIME= ITEMS.register( "music_disc_finite_time",
            () -> new RecordItem(6 , Modsounds.FINITE_TIME, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_FINITE_TIME = ITEMS.register("disc_fragment_finite_time",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_DISC_LYNX= ITEMS.register( "music_disc_lynx",
            () -> new RecordItem(6 , Modsounds.LYNX, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_LYNX = ITEMS.register("disc_fragment_lynx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_DISC_ACHIEVEMENT= ITEMS.register( "music_disc_achievement",
            () -> new RecordItem(6 , Modsounds.ACHIEVEMENT, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_ACHIEVEMENT = ITEMS.register("disc_fragment_achievement",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_DISC_FARVEL= ITEMS.register( "music_disc_farvel",
            () -> new RecordItem( 6, Modsounds.FARVEL, new Item.Properties().stacksTo(1), 44100));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
