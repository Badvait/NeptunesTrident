package me.advait.neptunetrident.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Trident;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ThrowListener implements Listener {

    @EventHandler
    public void onThrow(ProjectileLaunchEvent event) {
        if (!(event.getEntity() instanceof Trident)) return;
        Trident trident = (Trident) event.getEntity();
        trident.addPassenger((Entity) trident.getShooter());
    }

}
