package dev.inputlag.mixin;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

/** Dostęp do chronionych elementów ekranu kontenera. */
@Mixin(AbstractContainerScreen.class)
public interface AbstractContainerScreenAccessor {
    @Accessor("leftPos")
    int inputlag$getLeftPos();

    @Accessor("topPos")
    int inputlag$getTopPos();

    /** To samo wywołanie, którego używa vanilla (i oryginalny Mouse Tweaks) do klikania w sloty. */
    @Invoker("slotClicked")
    void inputlag$slotClicked(Slot slot, int slotId, int mouseButton, ClickType type);
}
