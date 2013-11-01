package me.TheOcultado.HighlanderGames;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class FileManager {
	
	public FileManager() {
	}

	static FileManager instance = new FileManager();

	public static FileManager getInstance() {
		return instance;
	}
	
	Plugin p;

	FileConfiguration locations;
	File lfile;
	
	public void setup(Plugin p) {

		if (!p.getDataFolder().exists()) {
			p.getDataFolder().mkdir();
		}

		lfile = new File(p.getDataFolder(), "Locations.yml");
		
		if (!lfile.exists()) {
			try {
				lfile.createNewFile();
			} catch (IOException e) {
				Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create Locations.yml!");
			}
		}
		locations = YamlConfiguration.loadConfiguration(lfile);
	}
	
	public FileConfiguration getSpleef() {
		return locations;
	}
	
	public void saveSpleef() {
		try {
			locations.save(lfile);
		} catch (IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save Locations.yml!");
		}
	}
	
	public void reloadSpleef() {
		locations = YamlConfiguration.loadConfiguration(lfile);
	}
	
	public PluginDescriptionFile getDesc() {
		return p.getDescription();
	}

}
