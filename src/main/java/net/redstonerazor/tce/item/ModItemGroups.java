package net.redstonerazor.tce.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.redstonerazor.tce.TCE;

public class ModItemGroups {
    public static final ItemGroup TCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TCE.MOD_ID,"twine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tce"))
                    .icon(() -> new ItemStack(ModItems.TWINE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TWINE);
                        entries.add(ModItems.FLINT_AXE);
                        entries.add(ModItems.FLINT_SHOVEL);
                        entries.add(ModItems.FLINT_SWORD);
                        entries.add(ModItems.FLINT_PICKAXE);
                        entries.add(ModItems.FLINT_HOE);
                        entries.add(ModItems.BONE_AXE);
                        entries.add(ModItems.BONE_SHOVEL);
                        entries.add(ModItems.BONE_SWORD);
                        entries.add(ModItems.BONE_PICKAXE);
                        entries.add(ModItems.BONE_HOE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_HOE);
                    }).build());

    public static void registerItemGroups() {
        TCE.LOGGER.info("Registering item groups for " + TCE.MOD_ID);
    }

}
