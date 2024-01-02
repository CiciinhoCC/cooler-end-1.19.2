package com.ciciinho.coolerend.event;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.item.client.ArmoredElytraModel;
import com.ciciinho.coolerend.item.client.ModModelLayers;
import com.ciciinho.coolerend.item.custom.ArmoredElytraItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CoolerEnd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEventBusEvents {
    @SubscribeEvent
    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions e) {
        e.registerLayerDefinition(ModModelLayers.ARMORED_ELYTRA, ArmoredElytraModel::createBodyLayer);
    }
}
