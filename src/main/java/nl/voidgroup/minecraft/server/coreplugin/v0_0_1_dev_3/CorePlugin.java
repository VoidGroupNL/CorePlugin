package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3;

import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3.util.DevelopmentVersion;
import org.bukkit.plugin.java.JavaPlugin;
import org.junit.Test;

import java.util.UUID;

public class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        new DevelopmentVersion("123..13123...", "1.2.3");

    }

    @Override
    public void onDisable() {

    }
}
