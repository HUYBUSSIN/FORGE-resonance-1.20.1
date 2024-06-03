package net.squarzy.resonance.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;

public class Modsounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Resonance.MOD_ID);


    public static final RegistryObject<SoundEvent> IRREAL = registerSoundEvent("irreal");

    public static final RegistryObject<SoundEvent> SPACE_PINBALL = registerSoundEvent("space_pinball");

    public static final RegistryObject<SoundEvent> NEW_REALIZATION = registerSoundEvent("new_realization");

    public static final RegistryObject<SoundEvent> NEVERMIND = registerSoundEvent("nevermind");

    public static final RegistryObject<SoundEvent> XASD = registerSoundEvent("xasd");

    public static final RegistryObject<SoundEvent> CHRONOLOGY = registerSoundEvent("chronology");

    public static final RegistryObject<SoundEvent> NOME_DA_MUSICA= registerSoundEvent("nome_da_musica");

    public static final RegistryObject<SoundEvent> TAKEAGUESS= registerSoundEvent("takeaguess");

    public static final RegistryObject<SoundEvent> WAY_WAY = registerSoundEvent("way_way");

    public static final RegistryObject<SoundEvent> WHOS_COUNTING_THE_DAYS= registerSoundEvent("whos_counting_the_days");

    public static final RegistryObject<SoundEvent> EDENIC_GREEN_PLUS = registerSoundEvent("edenic_green_plus");

    public static final RegistryObject<SoundEvent> CRYSTALLINE = registerSoundEvent("crystalline");

    public static final RegistryObject<SoundEvent> LOOKING_FORWARD = registerSoundEvent("looking_forward");

    public static final RegistryObject<SoundEvent> SKYSAIL = registerSoundEvent("skysail");

    public static final RegistryObject<SoundEvent> IN_BETWEEN_YEARS = registerSoundEvent("in_between_years");

    public static final RegistryObject<SoundEvent> DRIFTER = registerSoundEvent("drifter");

    public static final RegistryObject<SoundEvent> HEALS = registerSoundEvent("heals");

    public static final RegistryObject<SoundEvent> STAR_LEVEL_II = registerSoundEvent("star_level_ii");

    public static final RegistryObject<SoundEvent> GLASS_PRISM = registerSoundEvent("glass_prism");

    public static final RegistryObject<SoundEvent> UNDERWATER = registerSoundEvent("underwater");

    public static final RegistryObject<SoundEvent> HELLO_EARTH = registerSoundEvent("hello_earth");

    public static final RegistryObject<SoundEvent> HAZY_TRIP= registerSoundEvent("hazy_trip");

    public static final RegistryObject<SoundEvent> CALIGULA = registerSoundEvent("caligula");

    public static final RegistryObject<SoundEvent> BLISS = registerSoundEvent("bliss");

    public static final RegistryObject<SoundEvent> FINE_YOU = registerSoundEvent("fine_you");

    public static final RegistryObject<SoundEvent> PUNCH_YOUR_FACE = registerSoundEvent("punch_your_face");

    public static final RegistryObject<SoundEvent> A_CRY_IN_THE_DISTANCE = registerSoundEvent("a_cry_in_the_distance");

    public static final RegistryObject<SoundEvent> EARTH_BOUND = registerSoundEvent("earth_bound");

    public static final RegistryObject<SoundEvent> CHROME = registerSoundEvent("chrome");

    public static final RegistryObject<SoundEvent> UNCONSIOUS_RECOLLECTS_II = registerSoundEvent("unconscious_recollects_ii");

    public static final RegistryObject<SoundEvent> TRANQUILITY_PATH = registerSoundEvent("tranquility_path");

    public static final RegistryObject<SoundEvent> ARCARDIA_TOWN = registerSoundEvent("arcardia_town");

    public static final RegistryObject<SoundEvent> CHIC_SOLITUDE = registerSoundEvent("chic_solitude");

    public static final RegistryObject<SoundEvent> SUPERFICIALISM = registerSoundEvent("superficialism");

    public static final RegistryObject<SoundEvent> AERODYNAMIC_DISSEMINATION = registerSoundEvent("aerodynamic_dissemination");

    public static final RegistryObject<SoundEvent> UNIT_1644 = registerSoundEvent("unit_1644");

    public static final RegistryObject<SoundEvent> DRIVE_SLOW = registerSoundEvent("drive_slow");

    public static final RegistryObject<SoundEvent> NO_FUTURE = registerSoundEvent("no_future");

    public static final RegistryObject<SoundEvent> AQUA_PURA = registerSoundEvent("aqua_pura");

    public static final RegistryObject<SoundEvent> U_KNOW = registerSoundEvent("u_know");

    public static final RegistryObject<SoundEvent> A_NEW_DAY = registerSoundEvent("a_new_day");

    public static final RegistryObject<SoundEvent> RED_SKIES = registerSoundEvent("red_skies");

    public static final RegistryObject<SoundEvent> ALL_I_WANT = registerSoundEvent("all_i_want");

    public static final RegistryObject<SoundEvent> FINITE_TIME = registerSoundEvent("finite_time");

    public static final RegistryObject<SoundEvent> LYNX = registerSoundEvent("lynx");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Resonance.MOD_ID, name)));

    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
