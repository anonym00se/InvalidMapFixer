package com.haxalicious.InvalidMapFixer;

import org.bukkit.plugin.java.JavaPlugin;

public class InvalidMapFixer extends JavaPlugin {
    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new MapFixer(), this);
    }
    @Override
    public void onDisable() {
    }
}