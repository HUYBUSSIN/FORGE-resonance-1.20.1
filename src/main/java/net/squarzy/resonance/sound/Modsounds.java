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

    public static final RegistryObject<SoundEvent> NEW_REALIZATION = registerSoundEvent("new_realization");

    public static final RegistryObject<SoundEvent> XASD = registerSoundEvent("xasd");

    public static final RegistryObject<SoundEvent> NOME_DA_MUSICA= registerSoundEvent("nome_da_musica");

    public static final RegistryObject<SoundEvent> WAY_WAY = registerSoundEvent("way_way");

    public static final RegistryObject<SoundEvent> EDENIC_GREEN_PLUS = registerSoundEvent("edenic_green_plus");

    public static final RegistryObject<SoundEvent> LOOKING_FORWARD = registerSoundEvent("looking_forward");

    public static final RegistryObject<SoundEvent> IN_BETWEEN_YEARS = registerSoundEvent("in_between_years");

    public static final RegistryObject<SoundEvent> HEALS = registerSoundEvent("heals");

    public static final RegistryObject<SoundEvent> GLASS_PRISM = registerSoundEvent("glass_prism");

    public static final RegistryObject<SoundEvent> HELLO_EARTH = registerSoundEvent("hello_earth");

    public static final RegistryObject<SoundEvent> CALIGULA = registerSoundEvent("caligula");

    public static final RegistryObject<SoundEvent> FINE_YOU = registerSoundEvent("fine_you");

    public static final RegistryObject<SoundEvent> A_CRY_IN_THE_DISTANCE = registerSoundEvent("a_cry_in_the_distance");

    public static final RegistryObject<SoundEvent> CHROME = registerSoundEvent("chrome");

    public static final RegistryObject<SoundEvent> TRANQUILITY_PATH = registerSoundEvent("tranquility_path");

    public static final RegistryObject<SoundEvent> CHIC_SOLITUDE = registerSoundEvent("chic_solitude");
    public static final RegistryObject<SoundEvent> AERODYNAMIC_DISSEMINATION = registerSoundEvent("aerodynamic_dissemination");

    public static final RegistryObject<SoundEvent> DRIVE_SLOW = registerSoundEvent("drive_slow");

    public static final RegistryObject<SoundEvent> AQUA_PURA = registerSoundEvent("aqua_pura");

    public static final RegistryObject<SoundEvent> A_NEW_DAY = registerSoundEvent("a_new_day");

    public static final RegistryObject<SoundEvent> FINITE_TIME = registerSoundEvent("finite_time");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Resonance.MOD_ID, name)));

    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
