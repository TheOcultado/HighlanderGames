package me.TheOcultado.HighlanderGames;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HighlanderGames extends JavaPlugin {

	public final Logger log = Logger.getLogger("Minecraft");
	public static HighlanderGames plugin;

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.log.info(pdfFile.getName() + " has been Enabled!");
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.log.info(pdfFile.getName() + " has been Disabled!");
	}
	
}
