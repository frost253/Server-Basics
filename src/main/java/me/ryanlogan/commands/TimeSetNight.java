package me.ryanlogan.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeSetNight implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("timesetnight")) {
            World world = player.getWorld();
            world.setTime(1000);
        }
        return true;
    }
}
