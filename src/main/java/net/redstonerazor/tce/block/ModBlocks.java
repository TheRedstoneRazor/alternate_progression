package net.redstonerazor.tce.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SmokerBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redstonerazor.tce.TCE;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {

    public static final Block COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).strength(2.0f, 6.0f)));
    public static final Block OVEN = registerBlock("oven",
            new SmokerBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS).strength(2.5f, 3.0f).luminance(createLightLevelFromLitBlockState(13))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TCE.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TCE.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        TCE.LOGGER.info("Registering mod blocks for " + TCE.MOD_ID);


    }
}
