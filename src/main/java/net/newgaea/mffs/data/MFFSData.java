package net.newgaea.mffs.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class MFFSData {


    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator=event.getGenerator();



        if(event.includeServer()) {
            generator.addProvider(new MFFSRecipes(generator));

        }

        if(event.includeClient()) {
            generator.addProvider(new MFFSBlockStates(generator,  event.getExistingFileHelper()));
            generator.addProvider(new MFFSItemsProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new MFFSLangEn_Us(generator));
        }

        MFFSBlockTags blockTags=new MFFSBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(blockTags);
        generator.addProvider(new MFFSItemTags(generator,blockTags, event.getExistingFileHelper()));
        generator.addProvider(new MFFSDrops(generator));

    }
}
