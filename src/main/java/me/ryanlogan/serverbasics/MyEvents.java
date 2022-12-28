package me.ryanlogan.serverbasics;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.BLUE + "Welcome to the server! :)");
    }
}
