package net.amitron.ultralinks.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.amitron.ultralinks.GMain;

public class CommandsExecutor implements CommandExecutor {
	
	private GMain main;
	
	public CommandsExecutor(GMain main) {
		this.main = main;
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		String prefix = main.getConfig().getString("prefix");
		prefix = ChatColor.translateAlternateColorCodes('&', prefix);
		
		if(label.equalsIgnoreCase("teamspeak") && main.getConfig().getBoolean("teamspeak.enable")) 
		{
			if(main.getConfig().getString("teamspeak.permission").equals("null")) {
				String msg = main.getConfig().getString("teamspeak.message");
				p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
			}else {
				if(p.hasPermission(main.getConfig().getString("teamspeak.permission"))){
					String msg = main.getConfig().getString("teamspeak.message");
					p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
				}
			}
		}
		
		if(label.equalsIgnoreCase("youtube") && main.getConfig().getBoolean("youtube.enable")) 
		{
			if(main.getConfig().getString("youtube.permission").equals("null")) {
				String msg = main.getConfig().getString("youtube.message");
				p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
				
			}else {
				if(p.hasPermission(main.getConfig().getString("youtube.permission"))){
					String msg = main.getConfig().getString("youtube.message");
					p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
				}
			}
		}
		
		if(label.equalsIgnoreCase("website") && main.getConfig().getBoolean("website.enable")) 
		{
			if(main.getConfig().getString("website.permission").equals("null")) {
				String msg = main.getConfig().getString("website.message");
				p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
			}else {
				if(p.hasPermission(main.getConfig().getString("website.permission"))){
					String msg = main.getConfig().getString("website.message");
					p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
				}
			}
		}
		
		if(label.equalsIgnoreCase("discord") && main.getConfig().getBoolean("discord.enable")) 
		{
			if(main.getConfig().getString("discord.permission").equals("null")) {
				String msg = main.getConfig().getString("discord.message");
				p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
			}else {
				if(p.hasPermission(main.getConfig().getString("discord.permission"))){
					String msg = main.getConfig().getString("discord.message");
					p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
				}
			}
			
			
		}
		
		
		return false;
	}

}
