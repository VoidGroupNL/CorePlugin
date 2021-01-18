package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.commands;

import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public abstract class Command extends org.bukkit.command.Command {
    private JavaPlugin plugin;
    protected CommandManager commandManager;
    private String name;
    private String description;
    private String usageMessage;
    private List<String> aliases;
    private String fallbackprefix;

    public Command(JavaPlugin plugin, CommandManager commandManager, String name, String description, String usageMessage, List<String> aliases, String fallbackPrefix) {
        super(name, description, usageMessage, aliases);
        this.plugin = plugin;
        this.commandManager = commandManager;
        this.name = name;
        this.description = description;
        this.usageMessage = usageMessage;
        this.aliases = aliases;
        this.fallbackprefix = fallbackPrefix;
    }

    public void enable() {
        commandManager.enable(this);
    }
    public void disable() {
        commandManager.disable(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getUsageMessage() {
        return usageMessage;
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    public String getFallbackprefix() {
        return fallbackprefix;
    }
}
