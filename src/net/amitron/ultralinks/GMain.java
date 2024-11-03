package net.amitron.ultralinks;

import org.bukkit.plugin.java.JavaPlugin;

import net.amitron.ultralinks.commands.CommandsExecutor;

public class GMain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		getCommand("teamspeak").setExecutor(new CommandsExecutor(this));
		getCommand("youtube").setExecutor(new CommandsExecutor(this));
		getCommand("discord").setExecutor(new CommandsExecutor(this));
		getCommand("website").setExecutor(new CommandsExecutor(this));
		
	}

}
