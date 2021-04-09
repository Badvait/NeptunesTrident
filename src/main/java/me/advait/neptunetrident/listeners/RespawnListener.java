package me.advait.neptunetrident.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RespawnListener implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        ItemStack trident = new ItemStack(Material.TRIDENT);
        ItemMeta tridentMeta = trident.getItemMeta();
        tridentMeta.setDisplayName(ChatColor.GOLD + "Neptune's Trident");
        tridentMeta.setUnbreakable(true);
        tridentMeta.addEnchant(Enchantment.LOYALTY, 3, true);
        trident.setItemMeta(tridentMeta);
        event.getPlayer().getInventory().addItem(trident);
    }

}
