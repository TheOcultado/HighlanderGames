package me.TheOcultado.HighlanderGames;

import java.util.logging.Logger;

import me.TheOcultado.HighlanderGames.listeners.OnPlayerJoin;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HighlanderGames extends JavaPlugin {

	public final Logger log = Logger.getLogger("Minecraft");
	public static HighlanderGames plugin;
	
	FileManager files = FileManager.getInstance();
	
	public final OnPlayerJoin oPJ = new OnPlayerJoin();

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.log.info(pdfFile.getName() + " has been Enabled!");
		
		files.setup(this);
		
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(this.oPJ, this);
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.log.info(pdfFile.getName() + " has been Disabled!");
	}
	
}
