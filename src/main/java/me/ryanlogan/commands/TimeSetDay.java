package me.ryanlogan.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeSetDay implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (label.equalsIgnoreCase("timesetday")) {
            World world = player.getWorld();
            world.setTime(12000);
        }
        return true;
    }
}
