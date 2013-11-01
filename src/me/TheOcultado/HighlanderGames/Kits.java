package me.TheOcultado.HighlanderGames;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Kits {

	MessageManager mm = MessageManager.getInstance();
	PlayerDataManager data = PlayerDataManager.getInstance();

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
		
		data.addPlayer(p, kit);
		
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
			LeatherBoots.addEnchantment(Enchantment.PROTECTION_FALL, 3);
			p.getInventory().setBoots(LeatherBoots);
			
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,Integer.MAX_VALUE, 1));
			p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,Integer.MAX_VALUE, 1));

			ItemStack Arrows = new ItemStack(Material.ARROW, 16);
			inv.addItem(bow);
			inv.addItem(Arrows);

		} else if (kit.equalsIgnoreCase("Bomber")) {

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

		} else if (kit.equalsIgnoreCase("Tank")) {
			
			ItemStack DiamondHelmet = new ItemStack(Material.DIAMOND_HELMET);
			p.getInventory().setHelmet(DiamondHelmet);
			
			ItemStack DiamondChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
			p.getInventory().setHelmet(DiamondChest);
			
			ItemStack DiamondLegs = new ItemStack(Material.DIAMOND_LEGGINGS);
			p.getInventory().setLeggings(DiamondLegs);
			
			ItemStack DiamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
			p.getInventory().setBoots(DiamondBoots);
			
			ItemStack StoneSword = new ItemStack(Material.STONE_SWORD);
			StoneSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
			inv.addItem(StoneSword);
			
		}
	}
}