package me.ryanlogan.serverbasics;

import me.ryanlogan.commands.GamemodeCreative;
import me.ryanlogan.commands.GamemodeSurvival;
import me.ryanlogan.commands.TimeSetDay;
import me.ryanlogan.commands.TimeSetNight;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ServerBasics extends JavaPlugin {

    @Override
    public void onEnable() {

        //create instances of necessary classes
        TimeSetDay timeSetDay = new TimeSetDay();
        TimeSetNight timeSetNight = new TimeSetNight();
        GamemodeCreative gamemodeCreative = new GamemodeCreative();
        GamemodeSurvival gamemodeSurvival = new GamemodeSurvival();

        //register events
        getServer().getPluginManager().registerEvents(new MyEvents(), this);

        //register commands
        Objects.requireNonNull(getCommand("timesetday")).setExecutor(timeSetDay);
        Objects.requireNonNull(getCommand("timesetnight")).setExecutor(timeSetNight);
        Objects.requireNonNull(getCommand("gamemodecreative")).setExecutor(gamemodeCreative);
        Objects.requireNonNull(getCommand("gamemodesurvival")).setExecutor(gamemodeSurvival);

        //print message that plugin is enabled
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Server Basics Enabled [plugin]");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
