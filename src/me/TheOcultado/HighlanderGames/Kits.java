package me.TheOcultado.HighlanderGames;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
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
		if (kit.equalsIgnoreCase("Archer")) {
			
			ItemStack bow = new ItemStack(Material.BOW);
			bow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
			bow.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
			
			ItemStack LeatherHelmet = new ItemStack(Material.LEATHER_HELMET);
			LeatherHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			p.getInventory().setHelmet(LeatherHelmet);
			
			ItemStack LeatherChest = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			p.getInventory().setChestplate(LeatherChest);
			
			ItemStack LeatherLegs = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherLegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			p.getInventory().setLeggings(LeatherLegs);
			
			ItemStack LeatherBoots = new ItemStack(Material.LEATHER_BOOTS);
			LeatherBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			p.getInventory().setBoots(LeatherBoots);
			
			ItemStack Arrows = new ItemStack(Material.ARROW, 16);
			inv.addItem(bow);
			inv.addItem(Arrows);
			
			}else if(kit .equalsIgnoreCase("Bomber")){
				
			ItemStack tnt = new ItemStack(Material.TNT, 16);
			
			ItemStack LeatherHelmet = new ItemStack(Material.LEATHER_HELMET);
			LeatherHelmet.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
			p.getInventory().setHelmet(LeatherHelmet);
			
			ItemStack LeatherChest = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherChest.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
			p.getInventory().setChestplate(LeatherChest);
			
			ItemStack LeatherLegs = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherLegs.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
			p.getInventory().setLeggings(LeatherLegs);
			
			ItemStack LeatherBoots = new ItemStack(Material.LEATHER_BOOTS);
			LeatherBoots.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
			p.getInventory().setBoots(LeatherBoots);
			
			inv.addItem(tnt);
				
		}
	}
}