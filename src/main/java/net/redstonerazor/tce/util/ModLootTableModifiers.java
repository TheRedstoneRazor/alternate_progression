package net.redstonerazor.tce.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.InvertedLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.redstonerazor.tce.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier OAK_LEAVES_ID = new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier BIRCH_LEAVES_ID = new Identifier("minecraft", "blocks/birch_leaves");
    private static final Identifier SPRUCE_LEAVES_ID = new Identifier("minecraft", "blocks/spruce_leaves");
    private static final Identifier JUNGLE_LEAVES_ID = new Identifier("minecraft", "blocks/jungle_leaves");
    private static final Identifier DARK_OAK_LEAVES_ID = new Identifier("minecraft", "blocks/dark_oak_leaves");
    private static final Identifier ACACIA_LEAVES_ID = new Identifier("minecraft", "blocks/acacia_leaves");
    private static final Identifier MANGROVE_LEAVES_ID = new Identifier("minecraft", "blocks/mangrove_leaves");
    private static final Identifier CHERRY_LEAVES_ID = new Identifier("minecraft", "blocks/cherry_leaves");
    private static final Identifier AZALEA_LEAVES_ID = new Identifier("minecraft", "blocks/azalea_leaves");
    private static final Identifier FLOWERING_AZALEA_LEAVES_ID = new Identifier("minecraft", "blocks/flowering_azalea_leaves");
    private static final Identifier GRASS_ID = new Identifier("minecraft", "blocks/grass");
    private static final Identifier TALL_GRASS_ID = new Identifier("minecraft", "blocks/tall_grass");
    private static final Identifier VINE_ID = new Identifier("minecraft", "blocks/vine");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(OAK_LEAVES_ID.equals(id) || BIRCH_LEAVES_ID.equals(id) || SPRUCE_LEAVES_ID.equals(id) || JUNGLE_LEAVES_ID.equals(id) || DARK_OAK_LEAVES_ID.equals(id) || ACACIA_LEAVES_ID.equals(id) || MANGROVE_LEAVES_ID.equals(id) || CHERRY_LEAVES_ID.equals(id) || AZALEA_LEAVES_ID.equals(id) || FLOWERING_AZALEA_LEAVES_ID.equals(id)) { // this is awful
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .conditionally(InvertedLootCondition.builder(AnyOfLootCondition.builder(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS)), MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.ANY))))))
                        .with(ItemEntry.builder(Items.STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            /* currently replacing whole loot table
            if(GRASS_ID.equals(id) || TALL_GRASS_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().tag(ItemTags.SWORDS)))
                        .with(ItemEntry.builder(ModItems.TWINE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VINE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().tag(ItemTags.SWORDS)))
                        .with(ItemEntry.builder(ModItems.TWINE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
             */
        });
    }
}
