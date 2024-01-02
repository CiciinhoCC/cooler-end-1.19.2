package com.ciciinho.coolerend.item;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.item.custom.ArmoredElytraItem;
import com.ciciinho.coolerend.item.custom.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final ModArmorMaterial ARMORED_ELYTRA_MATERIAL =
            new ModArmorMaterial("armored_elytra", 25, new int[]{3, 3, 8, 3}, 10,
                    SoundEvents.ARMOR_EQUIP_LEATHER, 0);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoolerEnd.MOD_ID);

    public static final RegistryObject<Item> FOSSILIZED_SCALE = ITEMS.register("fossilized_scale",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ARMORED_ELYTRA = ITEMS.register("armored_elytra",
            () -> new ArmoredElytraItem(new Item.Properties().durability(832).rarity(Rarity.RARE)
                    .tab(CreativeModeTab.TAB_TRANSPORTATION), ARMORED_ELYTRA_MATERIAL));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
