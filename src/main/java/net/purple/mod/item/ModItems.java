package net.purple.mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ToolMaterial;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.purple.mod.PrehistoricMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricMod.MODID);

    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("woodenspear",
            () -> new Item(
                    new Item.Properties()
                            .sword(ToolMaterial.WOOD, 3F, -2.6F)
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrehistoricMod.MODID, "woodenspear")))));

    public static void register(BusGroup eventbus) {
        ITEMS.register(eventbus);
    }
}
