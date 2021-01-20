package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3;

import com.avaje.ebeaninternal.server.deploy.BeanDescriptor;
import nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3.util.DevelopmentVersion;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.junit.Test;

import java.util.UUID;

public class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("tnt").setExecutor(this);

    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Entity tnt = player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
        tnt.setVelocity(new Vector(player.get));
    }
}
