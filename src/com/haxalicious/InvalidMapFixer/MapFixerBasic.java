package com.haxalicious.InvalidMapFixer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("deprecation")
public class MapFixerBasic implements Listener {
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent event) { // Patch main exploit method
		try {
			ItemStack item = event.getCurrentItem();
			if(item.getType() == Material.MAP) { // Only check maps
				if(Bukkit.getMap(item.getDurability()) == null) { // Check for invalid map
					event.setCancelled(true);
					Inventory inventory = event.getClickedInventory();
					inventory.remove(item); // Nuke any remaining invalid maps
				}
			}
		} catch (NullPointerException npe) {
			// Don't spam the log with errors
		}
	}
}