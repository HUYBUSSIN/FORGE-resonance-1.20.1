package net.squarzy.resonance.common.registry.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.common.registry.sound.Resonancesounds;

public class Resonanceitems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Resonance.MOD_ID);

    // 1-Yes Da Da Da
    public static final RegistryObject<Item> MUSIC_DISC_IRREAL = ITEMS.register( "music_disc_irreal",
            () -> new RecordItem(6 , Resonancesounds.IRREAL, new Item.Properties(). stacksTo(1), 3640));

    public static final RegistryObject<Item> MUSIC_DISC_SPACE_PINBALL = ITEMS.register( "music_disc_space_pinball",
            () -> new RecordItem(6 , Resonancesounds.SPACE_PINBALL, new Item.Properties(). stacksTo(1), 4180));

    public static final RegistryObject<Item> MUSIC_DISC_UNDERWATER_WERE_OKAY = ITEMS.register( "music_disc_underwater_were_okay",
            () -> new RecordItem(6 , Resonancesounds.UNDERWATER_WERE_OKAY, new Item.Properties(). stacksTo(1), 5680));

    public static final RegistryObject<Item> MUSIC_DISC_ITS_CHANGED = ITEMS.register( "music_disc_its_changed",
            () -> new RecordItem(6 , Resonancesounds.ITS_CHANGED, new Item.Properties(). stacksTo(1), 4800));

    // 2-19999
    public static final RegistryObject<Item> MUSIC_DISC_NEW_REALIZATION = ITEMS.register( "music_disc_new_realization",
            () -> new RecordItem(6 , Resonancesounds.NEW_REALIZATION, new Item.Properties(). stacksTo(1), 3420));

    public static final RegistryObject<Item> MUSIC_DISC_NEVERMIND = ITEMS.register( "music_disc_nevermind",
            () -> new RecordItem(6 , Resonancesounds.NEVERMIND, new Item.Properties(). stacksTo(1), 3560));

    public static final RegistryObject<Item> MUSIC_DISC_SYNTHLINE = ITEMS.register( "music_disc_synthline",
            () -> new RecordItem(6 , Resonancesounds.SYNTHLINE, new Item.Properties(). stacksTo(1), 4200));

    public static final RegistryObject<Item> MUSIC_DISC_DREAM_PLACE_II = ITEMS.register( "music_disc_dream_place_ii",
            () -> new RecordItem(6 , Resonancesounds.DREAM_PLACE_II, new Item.Properties(). stacksTo(1), 3360));

    // 3-New Twilight Vol.1
    public static final RegistryObject<Item> MUSIC_DISC_XASD = ITEMS.register( "music_disc_xasd",
            () -> new RecordItem(6 , Resonancesounds.XASD, new Item.Properties(). stacksTo(1), 4000));

    public static final RegistryObject<Item> MUSIC_DISC_CHRONOLOGY = ITEMS.register( "music_disc_chronology",
            () -> new RecordItem(6 , Resonancesounds.CHRONOLOGY, new Item.Properties(). stacksTo(1), 2900));

    public static final RegistryObject<Item> MUSIC_DISC_PINWHEEL = ITEMS.register( "music_disc_pinwheel",
            () -> new RecordItem(6 , Resonancesounds.PINWHEEL, new Item.Properties(). stacksTo(1), 3320));

    public static final RegistryObject<Item> MUSIC_DISC_SKUNK = ITEMS.register( "music_disc_skunk",
            () -> new RecordItem(6 , Resonancesounds.SKUNK, new Item.Properties(). stacksTo(1), 3340));

    // 4-Dated New Aesthetics
    public static final RegistryObject<Item> MUSIC_DISC_NOME_DA_MUSICA = ITEMS.register( "music_disc_nome_da_musica",
            () -> new RecordItem(6 , Resonancesounds.NOME_DA_MUSICA, new Item.Properties(). stacksTo(1), 4446));

    public static final RegistryObject<Item> MUSIC_DISC_TAKEAGUESS = ITEMS.register( "music_disc_takeaguess",
            () -> new RecordItem(6 , Resonancesounds.TAKEAGUESS, new Item.Properties(). stacksTo(1), 3846));

    public static final RegistryObject<Item> MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE = ITEMS.register( "music_disc_how_he_found_the_world_all_strange_and_the_world_found_him_strange_likewise",
            () -> new RecordItem(6 , Resonancesounds.HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE, new Item.Properties(). stacksTo(1), 4680));

    public static final RegistryObject<Item> MUSIC_DISC_NOCTURNE_BUTTON_PRESSES = ITEMS.register( "music_disc_nocturne_button_presses",
            () -> new RecordItem(6 , Resonancesounds.NOCTURNE_BUTTON_PRESSES, new Item.Properties(). stacksTo(1), 3780));

    // 5-How to See Through Walls?
    public static final RegistryObject<Item> MUSIC_DISC_WAY_WAY = ITEMS.register( "music_disc_way_way",
            () -> new RecordItem(6 , Resonancesounds.WAY_WAY, new Item.Properties(). stacksTo(1), 3840));

    public static final RegistryObject<Item> MUSIC_DISC_WHOS_COUNTING_THE_DAYS = ITEMS.register( "music_disc_whos_counting_the_days",
            () -> new RecordItem(6 , Resonancesounds.WHOS_COUNTING_THE_DAYS, new Item.Properties(). stacksTo(1), 3600));

    public static final RegistryObject<Item> MUSIC_DISC_I_THINK_ITS_OVER = ITEMS.register( "music_disc_i_think_its_over",
            () -> new RecordItem(6 , Resonancesounds.I_THINK_ITS_OVER, new Item.Properties(). stacksTo(1), 3320));

    public static final RegistryObject<Item> MUSIC_DISC_NEW_MIDSTS_ACID = ITEMS.register( "music_disc_new_midsts_acid",
            () -> new RecordItem(6 , Resonancesounds.NEW_MIDSTS_ACID, new Item.Properties(). stacksTo(1), 4220));

    // 6-Empty Hiding World
    public static final RegistryObject<Item> MUSIC_DISC_EDENIC_GREEN_PLUS = ITEMS.register( "music_disc_edenic_green_plus",
            () -> new RecordItem(6 , Resonancesounds.EDENIC_GREEN_PLUS, new Item.Properties(). stacksTo(1), 4820));

    public static final RegistryObject<Item> MUSIC_DISC_CRYSTALLINE = ITEMS.register( "music_disc_crystalline",
            () -> new RecordItem(6 , Resonancesounds.CRYSTALLINE, new Item.Properties(). stacksTo(1), 2440));

    public static final RegistryObject<Item> MUSIC_DISC_ROULETTE = ITEMS.register( "music_disc_roulette",
            () -> new RecordItem(6 , Resonancesounds.ROULETTE, new Item.Properties(). stacksTo(1), 3960));

    public static final RegistryObject<Item> MUSIC_DISC_MANY_YEARS = ITEMS.register( "music_disc_many_years",
            () -> new RecordItem(6 , Resonancesounds.MANY_YEARS, new Item.Properties(). stacksTo(1), 4100));

    // 7-Magic Peaks
    public static final RegistryObject<Item> MUSIC_DISC_LOOKING_FORWARD = ITEMS.register( "music_disc_looking_forward",
            () -> new RecordItem(6 , Resonancesounds.LOOKING_FORWARD, new Item.Properties(). stacksTo(1), 3480));

    public static final RegistryObject<Item> MUSIC_DISC_SKYSAIL = ITEMS.register( "music_disc_skysail",
            () -> new RecordItem(6 , Resonancesounds.SKYSAIL, new Item.Properties(). stacksTo(1), 3860));

    public static final RegistryObject<Item> MUSIC_DISC_DISCOVERY = ITEMS.register( "music_disc_discovery",
            () -> new RecordItem(6 , Resonancesounds.DISCOVERY, new Item.Properties(). stacksTo(1), 3480));

    public static final RegistryObject<Item> MUSIC_DISC_NEBLINA = ITEMS.register( "music_disc_neblina",
            () -> new RecordItem(6 , Resonancesounds.NEBLINA, new Item.Properties(). stacksTo(1), 3600));

    // 8-Red Twilight
    public static final RegistryObject<Item> MUSIC_DISC_IN_BETWEEN_YEARS = ITEMS.register( "music_disc_in_between_years",
            () -> new RecordItem(6 , Resonancesounds.IN_BETWEEN_YEARS, new Item.Properties(). stacksTo(1), 5880));

    public static final RegistryObject<Item> MUSIC_DISC_DRIFTER = ITEMS.register( "music_disc_drifter",
            () -> new RecordItem(6 , Resonancesounds.DRIFTER, new Item.Properties(). stacksTo(1), 4800));

    public static final RegistryObject<Item> MUSIC_DISC_THER = ITEMS.register( "music_disc_ther",
            () -> new RecordItem(6 , Resonancesounds.THER, new Item.Properties(). stacksTo(1), 3560));

    public static final RegistryObject<Item> MUSIC_DISC_PACIFIC = ITEMS.register( "music_disc_pacific",
            () -> new RecordItem(6 , Resonancesounds.PACIFIC, new Item.Properties(). stacksTo(1), 3580));

    // 9-In The Worlde
    public static final RegistryObject<Item> MUSIC_DISC_HEALS = ITEMS.register( "music_disc_heals",
            () -> new RecordItem(6 , Resonancesounds.HEALS, new Item.Properties(). stacksTo(1), 3240));

    public static final RegistryObject<Item> MUSIC_DISC_STAR_LEVEL_II = ITEMS.register( "music_disc_star_level_ii",
            () -> new RecordItem(6 , Resonancesounds.STAR_LEVEL_II, new Item.Properties(). stacksTo(1), 3580));

    public static final RegistryObject<Item> MUSIC_DISC_STAR_LEVEL = ITEMS.register( "music_disc_star_level",
            () -> new RecordItem(6 , Resonancesounds.STAR_LEVEL, new Item.Properties(). stacksTo(1), 4200));

    public static final RegistryObject<Item> MUSIC_DISC_32K = ITEMS.register( "music_disc_32k",
            () -> new RecordItem(6 , Resonancesounds.THIRTY_TWO_K, new Item.Properties(). stacksTo(1), 2940));

    // 10-Glass Prism
    public static final RegistryObject<Item> MUSIC_DISC_GLASS_PRISM = ITEMS.register( "music_disc_glass_prism",
            () -> new RecordItem(6 , Resonancesounds.GLASS_PRISM, new Item.Properties(). stacksTo(1), 4200));

    public static final RegistryObject<Item> MUSIC_DISC_UNDERWATER = ITEMS.register( "music_disc_underwater",
            () -> new RecordItem(6 , Resonancesounds.UNDERWATER, new Item.Properties(). stacksTo(1), 4100));

    public static final RegistryObject<Item> MUSIC_DISC_I_SWEAR = ITEMS.register( "music_disc_i_swear",
            () -> new RecordItem(6 , Resonancesounds.I_SWEAR, new Item.Properties(). stacksTo(1), 3060));

    public static final RegistryObject<Item> MUSIC_DISC_SEE_YOU = ITEMS.register( "music_disc_see_you",
            () -> new RecordItem(6 , Resonancesounds.SEE_YOU, new Item.Properties(). stacksTo(1), 3200));

    // 11-Enchanted Instrumentals and Whispers
    public static final RegistryObject<Item> MUSIC_DISC_HELLO_EARTH= ITEMS.register( "music_disc_hello_earth",
            () -> new RecordItem(6 , Resonancesounds.HELLO_EARTH, new Item.Properties(). stacksTo(1), 3500));

    public static final RegistryObject<Item> MUSIC_DISC_HAZY_TRIP= ITEMS.register( "music_disc_hazy_trip",
            () -> new RecordItem(6 , Resonancesounds.HAZY_TRIP, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HYPNOSIS= ITEMS.register( "music_disc_hypnosis",
            () -> new RecordItem(6 , Resonancesounds.HYPNOSIS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_WASTING_TIME= ITEMS.register( "music_disc_wasting_time",
            () -> new RecordItem(6 , Resonancesounds.WASTING_TIME, new Item.Properties(). stacksTo(1), 4780));

    // 12-One Hundred Mornigns
    public static final RegistryObject<Item> MUSIC_DISC_CALIGULA= ITEMS.register( "music_disc_caligula",
            () -> new RecordItem(6 , Resonancesounds.CALIGULA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_BLISS= ITEMS.register( "music_disc_bliss",
            () -> new RecordItem(6 , Resonancesounds.BLISS, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MIND_MIRAGE= ITEMS.register( "music_disc_mind_mirage",
            () -> new RecordItem(6 , Resonancesounds.MIND_MIRAGE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_RITUALS= ITEMS.register( "music_disc_rituals",
            () -> new RecordItem(6 , Resonancesounds.RITUALS, new Item.Properties(). stacksTo(1), 3780));

    // 13-Nostalgi Gaius
    public static final RegistryObject<Item> MUSIC_DISC_FINE_YOU= ITEMS.register( "music_disc_fine_you",
            () -> new RecordItem(6 , Resonancesounds.FINE_YOU, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PUNCH_YOUR_FACE= ITEMS.register( "music_disc_punch_your_face",
            () -> new RecordItem(6 , Resonancesounds.PUNCH_YOUR_FACE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_LOST_AND_LOST= ITEMS.register( "music_disc_lost_and_lost",
            () -> new RecordItem(6 , Resonancesounds.LOST_AND_LOST, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ONE_DAY= ITEMS.register( "music_disc_one_day",
            () -> new RecordItem(6 , Resonancesounds.ONE_DAY, new Item.Properties(). stacksTo(1), 4880));

    // 14-Gradient Horizont
    public static final RegistryObject<Item> MUSIC_DISC_A_CRY_IN_THE_DISTANCE= ITEMS.register( "music_disc_a_cry_in_the_distance",
            () -> new RecordItem(6 , Resonancesounds.A_CRY_IN_THE_DISTANCE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_EARTHBOUND= ITEMS.register( "music_disc_earthbound",
            () -> new RecordItem(6 , Resonancesounds.EARTHBOUND, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TRANSIENT_FEELING= ITEMS.register( "music_disc_transient_feeling",
            () -> new RecordItem(6 , Resonancesounds.TRANSIENT_FEELING, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MOTION= ITEMS.register( "music_disc_motion",
            () -> new RecordItem(6 , Resonancesounds.MOTION, new Item.Properties(). stacksTo(1), 3960));

    // 15-Optimized
    public static final RegistryObject<Item> MUSIC_DISC_CHROME= ITEMS.register( "music_disc_chrome",
            () -> new RecordItem(6 , Resonancesounds.CHROME, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNCONSCIOUS_RECOLLECTS_II= ITEMS.register( "music_disc_unconscious_recollects_ii",
            () -> new RecordItem(6 , Resonancesounds.UNCONSCIOUS_RECOLLECTS_II, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_MIZUMI= ITEMS.register( "music_disc_mizumi",
            () -> new RecordItem(6 , Resonancesounds.MIZUMI, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNCONSCIOUS_RECOLLECTS= ITEMS.register( "music_disc_unconscious_recollects",
            () -> new RecordItem(6 , Resonancesounds.UNCONSCIOUS_RECOLLECTS, new Item.Properties(). stacksTo(1), 3940));

    // 16-Plume Valley
    public static final RegistryObject<Item> MUSIC_DISC_TRANQUILITY_PATH= ITEMS.register( "music_disc_tranquility_path",
            () -> new RecordItem(6 , Resonancesounds.TRANQUILITY_PATH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ARCADIA_TOWN= ITEMS.register( "music_disc_arcadia_town",
            () -> new RecordItem(6 , Resonancesounds.ARCADIA_TOWN, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_DREAM_PORT= ITEMS.register( "music_disc_dream_port",
            () -> new RecordItem(6 , Resonancesounds.DREAM_PORT, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_HIGHWIND_PRAIRIE= ITEMS.register( "music_disc_highwind_prairie",
            () -> new RecordItem(6 , Resonancesounds.HIGHWIND_PRAIRIE, new Item.Properties(). stacksTo(1), 5020));

    // 17-Pale Meditation
    public static final RegistryObject<Item> MUSIC_DISC_CHIC_SOLITUDE= ITEMS.register( "music_disc_chic_solitude",
            () -> new RecordItem(6 , Resonancesounds.CHIC_SOLITUDE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SUPERFICIALISM= ITEMS.register( "music_disc_superficialism",
            () -> new RecordItem(6 , Resonancesounds.SUPERFICIALISM, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SEEKING_TRUTH= ITEMS.register( "music_disc_seeking_truth",
            () -> new RecordItem(6 , Resonancesounds.SEEKING_TRUTH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TALKING_AND_TALKING= ITEMS.register( "music_disc_talking_and_talking",
            () -> new RecordItem(6 , Resonancesounds.TALKING_AND_TALKING, new Item.Properties(). stacksTo(1), 4120));

    // 18-Vitas of Chaos
    public static final RegistryObject<Item> MUSIC_DISC_AERODYNAMIC_DISSEMINATION= ITEMS.register( "music_disc_aerodynamic_dissemination",
            () -> new RecordItem(6 , Resonancesounds.AERODYNAMIC_DISSEMINATION, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_UNIT_1644= ITEMS.register( "music_disc_unit_1644",
            () -> new RecordItem(6 , Resonancesounds.UNIT_1644, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_TMIASFOR_CREEP= ITEMS.register( "music_disc_tmiasfor_creep",
            () -> new RecordItem(6 , Resonancesounds.TMIASFOR_CREEP, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_PROMYSHLENNYI= ITEMS.register( "music_disc_promyshlennyi",
            () -> new RecordItem(6 , Resonancesounds.PROMYSHLENNYI, new Item.Properties(). stacksTo(1), 4000));

    // 19-Reflections
    public static final RegistryObject<Item> MUSIC_DISC_DRIVE_SLOW= ITEMS.register( "music_disc_drive_slow",
            () -> new RecordItem(6 , Resonancesounds.DRIVE_SLOW, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_NO_FUTURE= ITEMS.register( "music_disc_no_future",
            () -> new RecordItem(6 , Resonancesounds.NO_FUTURE, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ARE_YOU_SAD_ENOUGH= ITEMS.register( "music_disc_are_you_sad_enough",
            () -> new RecordItem(6 , Resonancesounds.ARE_YOU_SAD_ENOUGH, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_CHASING_THE_SUN= ITEMS.register( "music_disc_chasing_the_sun",
            () -> new RecordItem(6 , Resonancesounds.CHASING_THE_SUN, new Item.Properties(). stacksTo(1), 5560));

    // 20-Nematophy
    public static final RegistryObject<Item> MUSIC_DISC_AQUA_PURA= ITEMS.register( "music_disc_aqua_pura",
            () -> new RecordItem(6 , Resonancesounds.AQUA_PURA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_U_KNOW= ITEMS.register( "music_disc_u_know",
            () -> new RecordItem(6 , Resonancesounds.U_KNOW, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_SEGA= ITEMS.register( "music_disc_sega",
            () -> new RecordItem(6 , Resonancesounds.SEGA, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_WHITENOISETRUTHFULL= ITEMS.register( "music_disc_whitenoisetruthfull",
            () -> new RecordItem(6 , Resonancesounds.WHITENOISETRUTHFULL, new Item.Properties(). stacksTo(1), 3540));

    // 21-Vibes
    public static final RegistryObject<Item> MUSIC_DISC_A_NEW_DAY= ITEMS.register( "music_disc_a_new_day",
            () -> new RecordItem(6 , Resonancesounds.A_NEW_DAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_RED_SKIES= ITEMS.register( "music_disc_red_skies",
            () -> new RecordItem(6 , Resonancesounds.RED_SKIES, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_ANOTHER_DAY= ITEMS.register( "music_disc_another_day",
            () -> new RecordItem(6 , Resonancesounds.ANOTHER_DAY, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_AFTER= ITEMS.register( "music_disc_after",
            () -> new RecordItem(6 , Resonancesounds.AFTER, new Item.Properties(). stacksTo(1), 2880));

    // 22-Cut Up Sections
    public static final RegistryObject<Item> MUSIC_DISC_ALL_I_WANT= ITEMS.register( "music_disc_all_i_want",
            () -> new RecordItem( 6, Resonancesounds.ALL_I_WANT, new Item.Properties().stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_REFRESH_SQUEEZED= ITEMS.register( "music_disc_refresh_squeezed",
            () -> new RecordItem( 6, Resonancesounds.REFRESH_SQUEEZED, new Item.Properties().stacksTo(1), 44100));

    public static final RegistryObject<Item> MUSIC_DISC_07_101FITNESS= ITEMS.register( "music_disc_07_101fitness",
            () -> new RecordItem( 6, Resonancesounds.ZEROSEVEN_101FITNESS, new Item.Properties().stacksTo(1), 2360));

    // Finite Time
    public static final RegistryObject<Item> MUSIC_DISC_FINITE_TIME= ITEMS.register( "music_disc_finite_time",
            () -> new RecordItem(6 , Resonancesounds.FINITE_TIME, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_FINITE_TIME = ITEMS.register("disc_fragment_finite_time",
            () -> new Item(new Item.Properties()));

    // Lynx
    public static final RegistryObject<Item> MUSIC_DISC_LYNX= ITEMS.register( "music_disc_lynx",
            () -> new RecordItem(6 , Resonancesounds.LYNX, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_LYNX = ITEMS.register("disc_fragment_lynx",
            () -> new Item(new Item.Properties()));

    // Achievement
    public static final RegistryObject<Item> MUSIC_DISC_ACHIEVEMENT= ITEMS.register( "music_disc_achievement",
            () -> new RecordItem(6 , Resonancesounds.ACHIEVEMENT, new Item.Properties(). stacksTo(1), 44100));

    public static final RegistryObject<Item> DISC_FRAGMENT_ACHIEVEMENT = ITEMS.register("disc_fragment_achievement",
            () -> new Item(new Item.Properties()));

    // Farvel
    public static final RegistryObject<Item> MUSIC_DISC_FARVEL= ITEMS.register( "music_disc_farvel",
            () -> new RecordItem( 6, Resonancesounds.FARVEL, new Item.Properties().stacksTo(1), 44100));

    // History Magic
    public static final RegistryObject<Item> MUSIC_DISC_HISTORY_MAGIC= ITEMS.register( "music_disc_history_magic",
            () -> new RecordItem(6 , Resonancesounds.HISTORY_MAGIC, new Item.Properties(). stacksTo(1), 4020));

    public static final RegistryObject<Item> DISC_FRAGMENT_HISTORY_MAGIC = ITEMS.register("disc_fragment_history_magic",
            () -> new Item(new Item.Properties()));

    // Pnemia
    public static final RegistryObject<Item> MUSIC_DISC_PNEMIA= ITEMS.register( "music_disc_pnemia",
            () -> new RecordItem(6 , Resonancesounds.PNEMIA, new Item.Properties(). stacksTo(1), 3700));

    // Xorri
    public static final RegistryObject<Item> MUSIC_DISC_XORRI= ITEMS.register( "music_disc_xorri",
            () -> new RecordItem(6 , Resonancesounds.XORRI, new Item.Properties(). stacksTo(1), 3860));

    // Clairvoyance
    public static final RegistryObject<Item> MUSIC_DISC_UNISON= ITEMS.register( "music_disc_unison",
            () -> new RecordItem(6 , Resonancesounds.UNISON, new Item.Properties(). stacksTo(1), 2800));

    public static final RegistryObject<Item> MUSIC_DISC_CONFLICTING_IDEAS= ITEMS.register( "music_disc_conflicting_ideas",
            () -> new RecordItem(6 , Resonancesounds.CONFLICTING_IDEAS, new Item.Properties(). stacksTo(1), 3520));

    public static final RegistryObject<Item> MUSIC_DISC_LITTLE_TO_NO_MEANING= ITEMS.register( "music_disc_little_to_no_meaning",
            () -> new RecordItem(6 , Resonancesounds.LITTLE_TO_NO_MEANING, new Item.Properties(). stacksTo(1), 2160));

    public static final RegistryObject<Item> MUSIC_DISC_BESTILL= ITEMS.register( "music_disc_bestill",
            () -> new RecordItem(6 , Resonancesounds.BESTILL, new Item.Properties(). stacksTo(1), 3520));

    public static final RegistryObject<Item> MUSIC_DISC_REACHING_OUT= ITEMS.register( "music_disc_reaching_out",
            () -> new RecordItem(6 , Resonancesounds.REACHING_OUT, new Item.Properties(). stacksTo(1), 3300));

    public static final RegistryObject<Item> MUSIC_DISC_CLAIRVOYANCE= ITEMS.register( "music_disc_clairvoyance",
            () -> new RecordItem(6 , Resonancesounds.CLAIRVOYANCE, new Item.Properties(). stacksTo(1), 3460));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
