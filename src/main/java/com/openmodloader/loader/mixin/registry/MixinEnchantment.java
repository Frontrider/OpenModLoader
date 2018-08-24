package com.openmodloader.loader.mixin.registry;

import com.openmodloader.api.registry.IRegistryEntry;
import me.modmuss50.fusion.api.Inject;
import me.modmuss50.fusion.api.Mixin;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;


@Mixin(Enchantment.class)
public class MixinEnchantment implements IRegistryEntry<Enchantment> {
    private Identifier registryName;

    @Inject
    @Override
    public Identifier getRegistryName() {
        return registryName;
    }

    @Inject
    @Override
    public void setRegistryName(Identifier identifier) {
        if (this.registryName != null) {
            //Already named
        }
        this.registryName = identifier;
    }
}