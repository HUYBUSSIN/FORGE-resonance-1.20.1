package net.squarzy.resonance.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.item.Moditems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Resonance.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(Moditems.MUSIC_DISC_YES_DA_DA_DA);
        simpleItem(Moditems.MUSIC_DISC_19999);
        simpleItem(Moditems.MUSIC_DISC_NEW_TWILIGHT);
        simpleItem(Moditems.MUSIC_DISC_DATED_NEW_AESTHETICS);
        simpleItem(Moditems.MUSIC_DISC_HOW_TO_SEE_THROUGH_WALLS);
        simpleItem(Moditems.MUSIC_DISC_EMPTY_HIDING_WORLD);
        simpleItem(Moditems.MUSIC_DISC_MAGIC_PEAKS);
        simpleItem(Moditems.MUSIC_DISC_RED_TWILIGHT);
        simpleItem(Moditems.MUSIC_DISC_IN_THE_WORLDE);
        simpleItem(Moditems.MUSIC_DISC_GLASS_PRISM);
        simpleItem(Moditems.MUSIC_DISC_ENCHANTED_INSTRUMENTALS_AND_WHISPERS);
        simpleItem(Moditems.MUSIC_DISC_ONE_HUNDRED_MORNINGS);
        simpleItem(Moditems.MUSIC_DISC_NOSTAlGI_GAIUS);
        simpleItem(Moditems.MUSIC_DISC_GRADIENT_HORIZONT);
        simpleItem(Moditems.MUSIC_DISC_OPTIMIZED);
        simpleItem(Moditems.MUSIC_DISC_PLUME_VALLEY);
        simpleItem(Moditems.MUSIC_DISC_PALE_MEDITATIONS);
        simpleItem(Moditems.MUSIC_DISC_VISTA_OF_CHAOS);
        simpleItem(Moditems.MUSIC_DISC_REFLECTIONS);
        simpleItem(Moditems.MUSIC_DISC_NEMATOPHY);
        simpleItem(Moditems.MUSIC_DISC_VIBES);
        simpleItem(Moditems.MUSIC_DISC_FINITE_TIME);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Resonance.MOD_ID, "item/" + item.getId().getPath()));
    }
}


