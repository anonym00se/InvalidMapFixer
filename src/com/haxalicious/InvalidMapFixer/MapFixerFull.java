package com.haxalicious.InvalidMapFixer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("deprecation")
public class MapFixerFull implements Listener {
	@EventHandler
	public void onPlayerPickupItemEvent(PlayerPickupItemEvent event) { // Patch exploit through container breaking
		Item droppedItem = event.getItem();
		ItemStack item = droppedItem.getItemStack();
		if(item.getType() == Material.MAP) { // Only check maps
			if(Bukkit.getMap(item.getDurability()) == null) { // Check for invalid map
				event.setCancelled(true);
				int stackSize = item.getAmount();
				droppedItem.setItemStack(new ItemStack(Material.MAP, stackSize, (short) 0)); // Revert map to ID 0
			}
		}
	}
}
