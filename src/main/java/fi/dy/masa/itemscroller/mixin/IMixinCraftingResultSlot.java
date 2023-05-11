package fi.dy.masa.itemscroller.mixin;

import net.minecraft.class_8566;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.screen.slot.CraftingResultSlot;

@Mixin(CraftingResultSlot.class)
public interface IMixinCraftingResultSlot
{
    @Accessor("input")
    class_8566 itemscroller_getCraftingInventory();
}
