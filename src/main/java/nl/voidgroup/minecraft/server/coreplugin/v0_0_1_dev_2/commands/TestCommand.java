package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.commands;

import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.CommandManager;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class TestCommand extends Command{

    public TestCommand(JavaPlugin plugin, CommandManager commandManager) {
        super(plugin, commandManager, "test", "A command made for testing", "test", new ArrayList<>(), "core");

    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        sender.sendMessage("Test");
        this.disable();
        return true;
    }
}
