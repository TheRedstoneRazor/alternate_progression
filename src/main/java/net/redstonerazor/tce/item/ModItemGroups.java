package net.redstonerazor.tce.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.redstonerazor.tce.TCE;
import net.redstonerazor.tce.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TCE.MOD_ID,"alternate_progression"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tce"))
                    .icon(() -> new ItemStack(ModItems.FLINT_SWORD)).entries((displayContext, entries) -> {
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
                        entries.add(ModItems.SIFTER);

                        entries.add(ModItems.BELLOWS);
                        entries.add(ModItems.TOOL_ROD);
                        entries.add(ModItems.TWINE);
                        entries.add(ModItems.HIDE);
                        entries.add(ModItems.LEATHER_PELT);
                        entries.add(ModItems.GROUT);
                        entries.add(ModItems.STONE_BRICK);
                        entries.add(ModItems.SULFUR);
                        entries.add(ModItems.ELDER_PRISMARINE);
                        entries.add(ModItems.ENDER_CATALYST);

                        entries.add(ModBlocks.OVEN);
                        entries.add(ModBlocks.COBBLED_BLACKSTONE);
                    }).build());

    public static void registerItemGroups() {
        TCE.LOGGER.info("Registering item groups for " + TCE.MOD_ID);
    }

}
