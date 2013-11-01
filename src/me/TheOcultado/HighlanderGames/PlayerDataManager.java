package me.TheOcultado.HighlanderGames;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class PlayerDataManager {

	private PlayerDataManager() {
	}

	public static PlayerDataManager instance = new PlayerDataManager();

	public static PlayerDataManager getInstance() {
		return instance;
	}

	public ArrayList<PlayerData> players = new ArrayList<PlayerData>();

	public PlayerData getData(Player p) {
		for (PlayerData pd : players) {
			if (pd.getPlayerName().equalsIgnoreCase(p.getName())) return pd;
		}
		return null;
	}

	public void addPlayer(Player p, String kit) {
		if (players.contains(this.getData(p))) {
			players.remove(this.getData(p));
		}
		players.add(new PlayerData(p.getName(), kit.toUpperCase()));
	}

	public void removePlayer(Player p) {
		players.remove(this.getData(p));
	}

}
