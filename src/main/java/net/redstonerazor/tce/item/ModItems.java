package net.redstonerazor.tce.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redstonerazor.tce.TCE;
import net.redstonerazor.tce.item.custom.SifterItem;

public class ModItems {

    public static final Item TWINE = registerItem("twine", new Item(new FabricItemSettings()));
    public static final Item SULFUR = registerItem("sulfur", new Item(new FabricItemSettings()));
    public static final Item HIDE = registerItem("hide", new Item(new FabricItemSettings()));
    public static final Item LEATHER_PELT = registerItem("leather_pelt", new Item(new FabricItemSettings()));
    public static final Item TOOL_ROD = registerItem("tool_rod", new Item(new FabricItemSettings()));
    public static final Item BELLOWS = registerItem("bellows", new Item(new FabricItemSettings()));
    public static final Item GROUT = registerItem("grout", new Item(new FabricItemSettings()));
    public static final Item STONE_BRICK = registerItem("stone_brick", new Item(new FabricItemSettings()));
    public static final Item ENDER_CATALYST = registerItem("ender_catalyst", new Item(new FabricItemSettings()));
    public static final Item ELDER_PRISMARINE = registerItem("elder_prismarine", new Item(new FabricItemSettings()));

    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterial.FLINT, 1, -2.8f, new FabricItemSettings()));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT, 3.0f, -2.8f, new FabricItemSettings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterial.FLINT, 2, -2.0f, new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT, 1.0f, -3.0f, new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterial.FLINT, 0, -3.0f, new FabricItemSettings()));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe",
            new PickaxeItem(ModToolMaterial.BONE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BONE_AXE = registerItem("bone_axe",
            new AxeItem(ModToolMaterial.BONE, 3.0f, -2.8f, new FabricItemSettings()));
    public static final Item BONE_SWORD = registerItem("bone_sword",
            new SwordItem(ModToolMaterial.BONE, 2, -2.0f, new FabricItemSettings()));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel",
            new ShovelItem(ModToolMaterial.BONE, 1.0f, -3.0f, new FabricItemSettings()));
    public static final Item BONE_HOE = registerItem("bone_hoe",
            new HoeItem(ModToolMaterial.BONE, 0, -3.0f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 5.0f, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -1, -2.0f, new FabricItemSettings()));

    public static final Item SIFTER = registerItem("sifter",
            new SifterItem(new FabricItemSettings().maxDamage(128)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TWINE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TCE.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TCE.LOGGER.info("Registering mod items for " + TCE.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
