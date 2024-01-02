package com.ciciinho.coolerend.event;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.client.ArmoredElytraRenderer;
import com.ciciinho.coolerend.item.client.ArmoredElytraModel;
import com.ciciinho.coolerend.item.client.ModModelLayers;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
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


    @SubscribeEvent
    public static void addLayers(EntityRenderersEvent.AddLayers evt)
    {
        addPlayerLayer(evt, "default");
        addPlayerLayer(evt, "slim");
    }

    private static void addPlayerLayer(EntityRenderersEvent.AddLayers evt, String skin)
    {
        EntityRenderer<? extends Player> renderer = evt.getSkin(skin);

        if (renderer instanceof LivingEntityRenderer livingRenderer) {
            livingRenderer.addLayer(new ArmoredElytraRenderer(livingRenderer));
        }
    }
}
