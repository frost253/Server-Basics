package me.ryanlogan.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.*;

public class GamemodeCreative implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, String label, String[] args) {
        Player player = (Player) sender;
        if ((label.equalsIgnoreCase("gamemodecreative"))) {
            player.setGameMode(GameMode.CREATIVE);
        }
        return true;
    }
}
