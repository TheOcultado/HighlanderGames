package me.TheOcultado.HighlanderGames;

public class PlayerData {

	private String player;
	private String kit;

	public PlayerData(String player, String kit) {
		this.player = player;
		this.kit = kit;
	}

	public String getPlayerName() {
		return player;
	}

	public String getKit() {
		return kit;
	}

}
