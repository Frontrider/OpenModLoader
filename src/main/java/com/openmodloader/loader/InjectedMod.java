package com.openmodloader.loader;

import com.github.zafarkhaja.semver.Version;
import com.openmodloader.api.mod.IMod;
import com.openmodloader.api.mod.IModData;
import com.openmodloader.api.mod.config.IModConfig;

public class InjectedMod implements IMod {
    private final String modid;
    private final Version version;

    public InjectedMod(String modid, Version version) {
        this.modid = modid;
        this.version = version;
    }

    @Override
    public void configure(IModConfig config) {

    }

    @Override
    public IModData getData() {
        return new IModData() {
            @Override
            public String getModId() {
                return modid;
            }

            @Override
            public Version getVersion() {
                return version;
            }

            @Override
            public String[] getDependencies() {
                return new String[0];
            }
        };
    }
}