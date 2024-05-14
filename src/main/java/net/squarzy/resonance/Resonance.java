package net.squarzy.resonance;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.squarzy.resonance.item.Moditems;
import net.squarzy.resonance.item.ResonanceModCreativeTab;
import net.squarzy.resonance.sound.Modsounds;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Resonance.MOD_ID)
public class Resonance {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "resonance";
    // Directly reference a slf4j logger

    public Resonance() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ResonanceModCreativeTab.register(modEventBus);

        Moditems.register(modEventBus);

        Modsounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
