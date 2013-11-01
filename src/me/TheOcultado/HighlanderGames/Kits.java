package me.TheOcultado.HighlanderGames;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;

public class Kits {

	MessageManager mm = MessageManager.getInstance();
	
	@SuppressWarnings("deprecation")
	public void clearInventory(Player player) {
		Inventory pi = player.getInventory();
		pi.clear();
		player.getInventory().setArmorContents(null);
		for (PotionEffect effect : player.getActivePotionEffects()) {
			player.removePotionEffect(effect.getType());
		}
		player.updateInventory();
	}
	
	public void selectKit(Player player, String kit) {
		Inventory inv = player.getInventory();
		clearInventory(player);
		if (kit .equalsIgnoreCase("")){
	
  }
 }
}