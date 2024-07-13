package net.redstonerazor.tce.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Blocks.class)
public class MakeWoodRequireToolMixin {
    @Inject(at = @At("HEAD"), method = "createLogBlock", cancellable = true)
    private static void init(MapColor topMapColor, MapColor sideMapColor, CallbackInfoReturnable<PillarBlock> cir) {
        cir.setReturnValue(
                new PillarBlock(AbstractBlock.Settings.create().mapColor((state) -> {
                    return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor;
                }).instrument(Instrument.BASS).strength(1.2F, 2.0F).requiresTool().sounds(BlockSoundGroup.WOOD).burnable())
        );
    }
}
