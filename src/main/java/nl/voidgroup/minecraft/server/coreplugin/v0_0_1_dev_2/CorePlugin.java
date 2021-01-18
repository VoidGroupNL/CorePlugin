package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2;

import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        CommandManager commandManager = new CommandManager(this, null);
        commandManager.register(new TestCommand(this, commandManager)).enable();
    }
}
