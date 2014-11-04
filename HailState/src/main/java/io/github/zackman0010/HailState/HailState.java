package io.github.zackman0010.HailState;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

 
@SuppressWarnings("unused")
public final class HailState extends JavaPlugin implements Listener {
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("hailstate")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "HAIL " + ChatColor.WHITE + "STATE!!!");
			return true;
		} else if (cmd.getName().equalsIgnoreCase("hailstatelogo")) {
			if (sender instanceof Player) {
				sender.sendMessage("This is still a major work in progress and will likely not be completed.");
				return true;
			} else {
				sender.sendMessage("This command cannot be run from the server.");
				return false;
			}
		} else if (cmd.getName().equalsIgnoreCase("heysong")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SERVER] - HEY SONG -");
			Bukkit.broadcastMessage(ChatColor.WHITE + "We're gonna beat the hell outta you!");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Maroon! White! Fight! Fight! Fight!");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Mississippi State! WHOO! Damn Right!");
			return true;
		} else if (cmd.getName().equalsIgnoreCase("fightsong")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SERVER] - FIGHT SONG -");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Hail dear old State!");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Fight for that victory today!");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Hit that line and tote that ball!");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Cross the goal before you fall!");
			Bukkit.broadcastMessage(ChatColor.WHITE + "And we will yell! Yell! Yell! Yell!");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "For dear old State, we yell like H E L L");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Fight for Mississippi State!");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Win the game today! GO STATE!");
			return true;
		} else if (cmd.getName().equalsIgnoreCase("almamater")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "[SERVER] - ALMA MATER -");
			Bukkit.broadcastMessage(ChatColor.WHITE + "In the heart of Mississippi");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Made by none but God's own hands");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Stately in her natural splendor");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Our alma mater proudly stands");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Mississippi State we love you");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Fondest memories cling to thee");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Life shall bear thy spirit ever");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Loyal friends we'll always be");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Maroon and White. Maroon and White.");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "Of thee with joy we sing");
			Bukkit.broadcastMessage(ChatColor.WHITE + "Our colors bright. Our souls delight.");
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "With praise our voices ring!");
			return true;
		} 
		return false;
	}
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		String message = event.getMessage().toLowerCase();
		String player = event.getPlayer().getName();
		if (message.contains("hail state")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "[North Jumbotron] Hail State!");
			Bukkit.broadcastMessage(ChatColor.WHITE + "[South Jumbotron] Hell Yeah!");
		}
		if (message.contains("tsun") || message.contains("ole miss") || message.contains("olemiss")) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "[North Jumbotron] SILENCE, " + player + "!!!");
			Bukkit.broadcastMessage(ChatColor.WHITE + "[South Jumbotron] We do not speak of that school!");
		}
	}
}

