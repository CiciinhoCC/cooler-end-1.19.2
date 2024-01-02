package com.ciciinho.coolerend.item.client;

import com.ciciinho.coolerend.CoolerEnd;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation ARMORED_ELYTRA = create("armored_elytra");



    private static ModelLayerLocation create(String name) {
        return new ModelLayerLocation(new ResourceLocation(CoolerEnd.MOD_ID, name), "main");
    }
}
