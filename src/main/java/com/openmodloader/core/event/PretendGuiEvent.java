package com.openmodloader.core.event;

import com.openmodloader.api.event.GenericEventTarget;
import com.openmodloader.api.event.IEvent;
import com.openmodloader.api.event.IEventTarget;
import net.minecraft.client.gui.Gui;

public class PretendGuiEvent<T extends Gui> implements IEvent {
    private final T gui;

    public PretendGuiEvent(T gui) {
        this.gui = gui;
    }

    public T getGui() {
        return gui;
    }

    @Override
    public IEventTarget<?> makeTarget() {
        return target(gui.getClass());
    }

    public static <T extends Gui> IEventTarget<PretendGuiEvent<T>> target(Class<T> target) {
        return GenericEventTarget.of(PretendGuiEvent.class, target);
    }
}
