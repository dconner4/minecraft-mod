package net.purple.mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.component.Weapon;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.purple.mod.PrehistoricMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricMod.MODID);

    public static final RegistryObject<Item> WOODENSPEAR = ITEMS.register("woodenspear",
            () -> new TridentItem(
                    new Item.Properties()
                            .durability(50)
                            .useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PrehistoricMod.MODID, "woodenspear")))));

    public static void register(BusGroup eventbus) {
        ITEMS.register(eventbus);
    }
}
