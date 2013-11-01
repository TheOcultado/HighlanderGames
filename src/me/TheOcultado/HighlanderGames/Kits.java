package me.TheOcultado.HighlanderGames;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;

public class Kits {

	MessageManager mm = MessageManager.getInstance();

	@SuppressWarnings("deprecation")
	public void clearInventory(Player p) {
		Inventory pi = p.getInventory();
		pi.clear();
		p.getInventory().setArmorContents(null);
		for (PotionEffect effect : p.getActivePotionEffects()) {
			p.removePotionEffect(effect.getType());
		}
		p.updateInventory();
	}

	public void selectKit(Player p, String kit) {
		Inventory inv = p.getInventory();
		clearInventory(p);
		if (kit.equalsIgnoreCase("")) {

			}else if(kit .equalsIgnoreCase("")){
		}
	}
}