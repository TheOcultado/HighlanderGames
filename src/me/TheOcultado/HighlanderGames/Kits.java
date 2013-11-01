package me.TheOcultado.HighlanderGames;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

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
			
		} else if(kit.equalsIgnoreCase("Knight")) {
			
			ItemStack IronHelmet = new ItemStack(Material.IRON_HELMET);
			IronHelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
			p.getInventory().setHelmet(IronHelmet);
			
			ItemStack IronChest = new ItemStack(Material.IRON_CHESTPLATE);
			IronChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			IronChest.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 1);
			p.getInventory().setChestplate(IronChest);
			
			ItemStack IronLegs = new ItemStack(Material.IRON_LEGGINGS);
			IronLegs.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
			p.getInventory().setLeggings(IronLegs);
			
			ItemStack IronBoots = new ItemStack(Material.IRON_BOOTS);
			IronBoots.addEnchantment(Enchantment.PROTECTION_FALL, 1);
			p.getInventory().setBoots(IronBoots);
			
			ItemStack IronSword = new ItemStack(Material.IRON_SWORD);
			IronSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
		} else if(kit.equalsIgnoreCase("Chemist")){
			
			ItemStack Potion1 = new ItemStack(Material.POTION, 15);
        	Potion pot = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot.setType(PotionType.INSTANT_DAMAGE);
        	pot.setSplash(true);
        	pot.apply(Potion1);
        	p.getInventory().addItem(Potion1);
        	
        	ItemStack Potion11 = new ItemStack(Material.POTION, 5);
        	Potion pot1 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot1.setType(PotionType.POISON);
        	pot1.setHasExtendedDuration(true);
        	pot1.setSplash(true);
        	pot1.apply(Potion11);
        	p.getInventory().addItem(Potion11);
        	
        	ItemStack Potion111 = new ItemStack(Material.POTION, 5);
        	Potion pot11 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot11.setType(PotionType.INSTANT_HEAL);
        	pot11.setSplash(true);
        	pot11.apply(Potion111);
        	p.getInventory().addItem(Potion111);
        	
        	ItemStack Potion1111 = new ItemStack(Material.POTION, 5);
        	Potion pot111 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot111.setType(PotionType.WEAKNESS);
        	pot111.setSplash(true);
        	pot111.apply(Potion1111);
        	p.getInventory().addItem(Potion1111);
        	
        	ItemStack Potion11111 = new ItemStack(Material.POTION, 5);
        	Potion pot1111 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot1111.setType(PotionType.REGEN);
        	pot1111.setSplash(true);
        	pot1111.apply(Potion11111);
        	p.getInventory().addItem(Potion11111);
        	
        	ItemStack Potion111111 = new ItemStack(Material.POTION, 5);
        	Potion pot11111 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot11111.setType(PotionType.SPEED);
        	pot11111.setSplash(true);
        	pot11111.apply(Potion111111);
        	p.getInventory().addItem(Potion111111);
        	

        	ItemStack Potion1111111 = new ItemStack(Material.POTION, 5);
        	Potion pot111111 = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
        	pot111111.setType(PotionType.SLOWNESS);
        	pot111111.setSplash(true);
        	pot111111.apply(Potion1111111);
        	p.getInventory().addItem(Potion1111111);
        	
        	ItemStack LeatherHelmet = new ItemStack(Material.LEATHER_HELMET);
        	LeatherHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        	LeatherArmorMeta metah = (LeatherArmorMeta) LeatherHelmet.getItemMeta();
        	metah.setColor(Color.RED);
        	LeatherHelmet.setItemMeta(metah);
        	
        	ItemStack LeatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            LeatherArmorMeta metac = (LeatherArmorMeta) LeatherChestplate.getItemMeta();
            metac.setColor(Color.GREEN);
            LeatherChestplate.setItemMeta(metac);
            
        	ItemStack LeatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        	LeatherLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        	LeatherArmorMeta metal = (LeatherArmorMeta) LeatherLeggings.getItemMeta();
            metal.setColor(Color.FUCHSIA);
            LeatherLeggings.setItemMeta(metal);
        	
        	ItemStack LeatherBoots = new ItemStack(Material.LEATHER_BOOTS);
        	LeatherBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        	LeatherArmorMeta metab = (LeatherArmorMeta) LeatherBoots.getItemMeta();
            metab.setColor(Color.ORANGE);
            LeatherBoots.setItemMeta(metab);
             
                    	
        	
        p.getInventory() .setChestplate(LeatherChestplate);	
        p.getInventory() .setLeggings(LeatherLeggings);
        p.getInventory() .setBoots(LeatherBoots);
        	
        	
        	p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,
					Integer.MAX_VALUE, 1));
			
			
		}
	}
}