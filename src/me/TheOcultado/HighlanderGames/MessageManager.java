package me.TheOcultado.HighlanderGames;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageManager {

	private MessageManager() {
	}

	public static MessageManager instance = new MessageManager();

	public static MessageManager getInstance() {
		return instance;
	}

	public void good(Player p, String msg) {
		p.sendMessage(ChatColor.GREEN + msg);
	}

	public void info(Player p, String msg) {
		p.sendMessage(ChatColor.GOLD + msg);
	}

	public void bad(Player p, String msg) {
		p.sendMessage(ChatColor.RED + msg);
	}

	public void msg(Player p, String msg) {
		p.sendMessage(ChatColor.WHITE + msg);
	}

}
