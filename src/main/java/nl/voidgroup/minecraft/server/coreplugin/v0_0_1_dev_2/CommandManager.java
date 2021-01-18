package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2;

import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_2.commands.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.HashMap;

public class CommandManager {
    private JavaPlugin plugin;
    private RegisterManager registerManager;
    private CommandMap serverCommandMap;
    private HashMap<String, Command> serverCommandMap_;
    private HashMap<String, Command> coreRegisteredCommands;


    public CommandManager(JavaPlugin plugin, RegisterManager registerManager) {
        this.plugin = plugin;
        this.registerManager = registerManager;
        try{
            final Field commandMapField = plugin.getServer().getClass().getDeclaredField("commandMap");
            commandMapField.setAccessible(true);
            this.serverCommandMap = (CommandMap) commandMapField.get(plugin.getServer());
        } catch (Exception e) {
            System.out.println("Failed to get serverCommands");
            e.printStackTrace();
        }
        try{
            final Field knownCommandsField = serverCommandMap.getClass().getDeclaredField("knownCommands");
            knownCommandsField.setAccessible(true);
            this.serverCommandMap_ = (HashMap<String, Command>) knownCommandsField.get(serverCommandMap);
        } catch (Exception e) {
            System.out.println("Failed to get serverCommands HashMap");
            e.printStackTrace();
        }
        coreRegisteredCommands = new HashMap<>();
    }

    public Command register(Command cmd) {
        coreRegisteredCommands.put(cmd.getName(), cmd);
        return cmd;
    }
    public Command enable(Command cmd) {
        serverCommandMap.register(cmd.getName(), cmd.getFallbackprefix(), cmd);
        return cmd;
    }
    public Command disable(Command cmd) {
        serverCommandMap_.remove(cmd.getName());
        return cmd;
    }
    public Command getCommand(String name) {
        return coreRegisteredCommands.get(name);
    }
}
