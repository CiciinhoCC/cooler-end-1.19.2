package com.ciciinho.coolerend.client;

import com.ciciinho.coolerend.item.client.ArmoredElytraModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ArmoredElytraRenderer extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {

    public ArmoredElytraRenderer(RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> pRenderer) {
        super(pRenderer);
    }

    @Override
    public void render(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight,
                       AbstractClientPlayer pLivingEntity, float pLimbSwing, float pLimbSwingAmount,
                       float pPartialTick, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        ArmoredElytraModel model = new ArmoredElytraModel(ArmoredElytraModel.createBodyLayer().bakeRoot());
        this.getParentModel().copyPropertiesTo(model);
        model.setupAngles(this.getParentModel());

        ResourceLocation loc = new ResourceLocation("coolerend", "textures/armor/armored_elytra");
        VertexConsumer vertexConsumer = pBuffer.getBuffer(RenderType.entitySolid(loc));

        model.renderToBuffer(pPoseStack,vertexConsumer,pPackedLight, OverlayTexture.NO_OVERLAY,
                1.0f,1.0f, 1.0f,1.0f);
    }
}
