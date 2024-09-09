package net.squarzy.resonance.common.registry.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;

public class Resonancesounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Resonance.MOD_ID);

    // 1-Yes Da Da Da
    public static final RegistryObject<SoundEvent> IRREAL = registerSoundEvent("irreal");

    public static final RegistryObject<SoundEvent> SPACE_PINBALL = registerSoundEvent("space_pinball");

    public static final RegistryObject<SoundEvent> UNDERWATER_WERE_OKAY = registerSoundEvent("underwater_were_okay");

    public static final RegistryObject<SoundEvent> ITS_CHANGED = registerSoundEvent("its_changed");

    // 2-19999
    public static final RegistryObject<SoundEvent> NEW_REALIZATION = registerSoundEvent("new_realization");

    public static final RegistryObject<SoundEvent> NEVERMIND = registerSoundEvent("nevermind");

    public static final RegistryObject<SoundEvent> SYNTHLINE = registerSoundEvent("synthline");

    public static final RegistryObject<SoundEvent> DREAM_PLACE_II = registerSoundEvent("dream_place_ii");

    // 3-New Twilight Vol.1
    public static final RegistryObject<SoundEvent> XASD = registerSoundEvent("xasd");

    public static final RegistryObject<SoundEvent> CHRONOLOGY = registerSoundEvent("chronology");

    public static final RegistryObject<SoundEvent> PINWHEEL = registerSoundEvent("pinwheel");

    public static final RegistryObject<SoundEvent> SKUNK = registerSoundEvent("skunk");

    // 4-Dated New Aesthetics
    public static final RegistryObject<SoundEvent> NOME_DA_MUSICA= registerSoundEvent("nome_da_musica");

    public static final RegistryObject<SoundEvent> TAKEAGUESS= registerSoundEvent("takeaguess");

    public static final RegistryObject<SoundEvent> HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE= registerSoundEvent("how_he_found_the_world_all_strange_and_the_world_found_him_strange_likewise");

    public static final RegistryObject<SoundEvent> NOCTURNE_BUTTON_PRESSES= registerSoundEvent("nocturne_button_presses");

    // 5-How to See Through Walls?
    public static final RegistryObject<SoundEvent> WAY_WAY = registerSoundEvent("way_way");

    public static final RegistryObject<SoundEvent> WHOS_COUNTING_THE_DAYS= registerSoundEvent("whos_counting_the_days");

    public static final RegistryObject<SoundEvent> I_THINK_ITS_OVER = registerSoundEvent("i_think_its_over");

    public static final RegistryObject<SoundEvent> NEW_MIDSTS_ACID = registerSoundEvent("new_midsts_acid");

    // 6-Empty Hiding World
    public static final RegistryObject<SoundEvent> EDENIC_GREEN_PLUS = registerSoundEvent("edenic_green_plus");

    public static final RegistryObject<SoundEvent> CRYSTALLINE = registerSoundEvent("crystalline");

    public static final RegistryObject<SoundEvent> ROULETTE = registerSoundEvent("roulette");

    public static final RegistryObject<SoundEvent> MANY_YEARS = registerSoundEvent("many_years");

    // 7-Magic Peaks
    public static final RegistryObject<SoundEvent> LOOKING_FORWARD = registerSoundEvent("looking_forward");

    public static final RegistryObject<SoundEvent> SKYSAIL = registerSoundEvent("skysail");

    public static final RegistryObject<SoundEvent> DISCOVERY = registerSoundEvent("discovery");

    public static final RegistryObject<SoundEvent> NEBLINA = registerSoundEvent("neblina");

    // 8-Red Twilight
    public static final RegistryObject<SoundEvent> IN_BETWEEN_YEARS = registerSoundEvent("in_between_years");

    public static final RegistryObject<SoundEvent> DRIFTER = registerSoundEvent("drifter");

    public static final RegistryObject<SoundEvent> THER = registerSoundEvent("ther");

    public static final RegistryObject<SoundEvent> PACIFIC = registerSoundEvent("pacific");

    // 9-In the Worlde
    public static final RegistryObject<SoundEvent> HEALS = registerSoundEvent("heals");

    public static final RegistryObject<SoundEvent> STAR_LEVEL_II = registerSoundEvent("star_level_ii");

    public static final RegistryObject<SoundEvent> STAR_LEVEL = registerSoundEvent("star_level");

    public static final RegistryObject<SoundEvent> THIRTY_TWO_K = registerSoundEvent("32k");

    // 10-Glass Prism
    public static final RegistryObject<SoundEvent> GLASS_PRISM = registerSoundEvent("glass_prism");

    public static final RegistryObject<SoundEvent> UNDERWATER = registerSoundEvent("underwater");

    public static final RegistryObject<SoundEvent> I_SWEAR = registerSoundEvent("i_swear");

    public static final RegistryObject<SoundEvent> SEE_YOU = registerSoundEvent("see_you");

    // 11-Enchanted Instrumentals and Whispers
    public static final RegistryObject<SoundEvent> HELLO_EARTH = registerSoundEvent("hello_earth");

    public static final RegistryObject<SoundEvent> HAZY_TRIP= registerSoundEvent("hazy_trip");

    public static final RegistryObject<SoundEvent> HYPNOSIS= registerSoundEvent("hypnosis");

    public static final RegistryObject<SoundEvent> WASTING_TIME= registerSoundEvent("wasting_time");

    // 12-One Hundred Mornings
    public static final RegistryObject<SoundEvent> CALIGULA = registerSoundEvent("caligula");

    public static final RegistryObject<SoundEvent> BLISS = registerSoundEvent("bliss");

    public static final RegistryObject<SoundEvent> MIND_MIRAGE = registerSoundEvent("mind_mirage");

    public static final RegistryObject<SoundEvent> RITUALS = registerSoundEvent("rituals");

    // 13-Nostalgi Gaius
    public static final RegistryObject<SoundEvent> FINE_YOU = registerSoundEvent("fine_you");

    public static final RegistryObject<SoundEvent> PUNCH_YOUR_FACE = registerSoundEvent("punch_your_face");

    public static final RegistryObject<SoundEvent> LOST_AND_LOST = registerSoundEvent("lost_and_lost");

    public static final RegistryObject<SoundEvent> ONE_DAY = registerSoundEvent("one_day");

    // 14-Gradient Horizont
    public static final RegistryObject<SoundEvent> A_CRY_IN_THE_DISTANCE = registerSoundEvent("a_cry_in_the_distance");

    public static final RegistryObject<SoundEvent> EARTHBOUND = registerSoundEvent("earthbound");

    public static final RegistryObject<SoundEvent> TRANSIENT_FEELING = registerSoundEvent("transient_feeling");

    public static final RegistryObject<SoundEvent> MOTION = registerSoundEvent("motion");

    // 15-Optimized
    public static final RegistryObject<SoundEvent> CHROME = registerSoundEvent("chrome");

    public static final RegistryObject<SoundEvent> UNCONSCIOUS_RECOLLECTS_II = registerSoundEvent("unconscious_recollects_ii");

    public static final RegistryObject<SoundEvent> MIZUMI = registerSoundEvent("mizumi");

    public static final RegistryObject<SoundEvent> UNCONSCIOUS_RECOLLECTS = registerSoundEvent("unconscious_recollects");

    // 16-Plume Valley
    public static final RegistryObject<SoundEvent> TRANQUILITY_PATH = registerSoundEvent("tranquility_path");

    public static final RegistryObject<SoundEvent> ARCADIA_TOWN = registerSoundEvent("arcadia_town");

    public static final RegistryObject<SoundEvent> DREAM_PORT = registerSoundEvent("dream_port");

    public static final RegistryObject<SoundEvent> HIGHWIND_PRAIRIE = registerSoundEvent("highwind_prairie");

    // 17-Pale Meditation
    public static final RegistryObject<SoundEvent> CHIC_SOLITUDE = registerSoundEvent("chic_solitude");

    public static final RegistryObject<SoundEvent> SUPERFICIALISM = registerSoundEvent("superficialism");

    public static final RegistryObject<SoundEvent> SEEKING_TRUTH = registerSoundEvent("seeking_truth");

    public static final RegistryObject<SoundEvent> TALKING_AND_TALKING = registerSoundEvent("talking_and_talking");

    // 18-Vitas of Chaos
    public static final RegistryObject<SoundEvent> AERODYNAMIC_DISSEMINATION = registerSoundEvent("aerodynamic_dissemination");

    public static final RegistryObject<SoundEvent> UNIT_1644 = registerSoundEvent("unit_1644");

    public static final RegistryObject<SoundEvent> TMIASFOR_CREEP = registerSoundEvent("tmiasfor_creep");

    public static final RegistryObject<SoundEvent> PROMYSHLENNYI = registerSoundEvent("promyshlennyi");

    // 19-Reflections

    public static final RegistryObject<SoundEvent> DRIVE_SLOW = registerSoundEvent("drive_slow");

    public static final RegistryObject<SoundEvent> NO_FUTURE = registerSoundEvent("no_future");

    public static final RegistryObject<SoundEvent> ARE_YOU_SAD_ENOUGH = registerSoundEvent("are_you_sad_enough");

    public static final RegistryObject<SoundEvent> CHASING_THE_SUN = registerSoundEvent("chasing_the_sun");

    // 20-Nematophy

    public static final RegistryObject<SoundEvent> AQUA_PURA = registerSoundEvent("aqua_pura");

    public static final RegistryObject<SoundEvent> U_KNOW = registerSoundEvent("u_know");

    public static final RegistryObject<SoundEvent> SEGA = registerSoundEvent("sega");

    public static final RegistryObject<SoundEvent> WHITENOISETRUTHFULL = registerSoundEvent("whitenoisetruthfull");

    // 21-Vibes
    public static final RegistryObject<SoundEvent> A_NEW_DAY = registerSoundEvent("a_new_day");

    public static final RegistryObject<SoundEvent> RED_SKIES = registerSoundEvent("red_skies");

    public static final RegistryObject<SoundEvent> ANOTHER_DAY = registerSoundEvent("another_day");

    public static final RegistryObject<SoundEvent> AFTER = registerSoundEvent("after");

    // 22-Cut Up Sections
    public static final RegistryObject<SoundEvent> ALL_I_WANT = registerSoundEvent("all_i_want");

    public static final RegistryObject<SoundEvent> REFRESH_SQUEEZED = registerSoundEvent("refresh_squeezed");

    public static final RegistryObject<SoundEvent> ZEROSEVEN_101FITNESS = registerSoundEvent("07_101fitness");

    // Finite Time
    public static final RegistryObject<SoundEvent> FINITE_TIME = registerSoundEvent("finite_time");

    // Lynx
    public static final RegistryObject<SoundEvent> LYNX = registerSoundEvent("lynx");

    // Achievement
    public static final RegistryObject<SoundEvent> ACHIEVEMENT = registerSoundEvent("achievement");

    // Farvel
    public static final RegistryObject<SoundEvent> FARVEL = registerSoundEvent("farvel");

    // History Magic
    public static final RegistryObject<SoundEvent> HISTORY_MAGIC = registerSoundEvent("history_magic");

    // Pnemia
    public static final RegistryObject<SoundEvent> PNEMIA = registerSoundEvent("pnemia");

    // Xorri
    public static final RegistryObject<SoundEvent> XORRI = registerSoundEvent("xorri");

    // Clairvoyance
    public static final RegistryObject<SoundEvent> CLAIRVOYANCE = registerSoundEvent("clairvoyance");

    // Conflicting Ideas
    public static final RegistryObject<SoundEvent> CONFLICTING_IDEAS = registerSoundEvent("conflicting_ideas");

    // Bestill
    public static final RegistryObject<SoundEvent> BESTILL = registerSoundEvent("bestill");

    // Unison
    public static final RegistryObject<SoundEvent> UNISON = registerSoundEvent("unison");

    // Reaching Out
    public static final RegistryObject<SoundEvent> REACHING_OUT= registerSoundEvent("reaching_out");

    // Little To No Meaning
    public static final RegistryObject<SoundEvent> LITTLE_TO_NO_MEANING = registerSoundEvent("little_to_no_meaning");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Resonance.MOD_ID, name)));

    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
