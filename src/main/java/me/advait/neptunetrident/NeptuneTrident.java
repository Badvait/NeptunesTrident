package me.advait.neptunetrident;

import me.advait.neptunetrident.listeners.RespawnListener;
import me.advait.neptunetrident.listeners.ThrowListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NeptuneTrident extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new RespawnListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ThrowListener(), this);
    }

}
