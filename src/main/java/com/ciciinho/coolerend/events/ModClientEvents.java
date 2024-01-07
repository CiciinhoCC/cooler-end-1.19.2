package com.ciciinho.coolerend.events;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.item.models.ArmoredElytraModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.ciciinho.coolerend.item.models.ModModelLayers;

@Mod.EventBusSubscriber(modid = CoolerEnd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions e) {
        e.registerLayerDefinition(ModModelLayers.ARMORED_ELYTRA, ArmoredElytraModel::createBodyLayer);
    }


}
