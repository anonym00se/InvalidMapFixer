package com.haxalicious.InvalidMapFixer;

import org.bukkit.plugin.java.JavaPlugin;

public class InvalidMapFixer extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.saveDefaultConfig();
    	String mode = this.getConfig().getString("mode");
    	if(mode.equals("Disabled")) {
    		this.setEnabled(false);
    	}
    	if(mode.equals("Basic") || mode.equals("Full")) {
    		getServer().getPluginManager().registerEvents(new MapFixerBasic(), this);
    	}
    	if(mode.equals("Full")) {
    		getServer().getPluginManager().registerEvents(new MapFixerFull(), this);
    	}
    }
    @Override
    public void onDisable() {
    }
}