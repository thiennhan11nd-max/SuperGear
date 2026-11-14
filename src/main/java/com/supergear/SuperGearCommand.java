package com.supergear;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

public class SuperGearCommand implements CommandExecutor {

    // ===== CUP XIN =====
    public static ItemStack makeCup() {
        ItemStack cup = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = cup.getItemMeta();
        meta.setDisplayName("§b§lCUP THAN - DAO SIEU TOC");
        meta.setLore(Arrays.asList(
            "§7Cup cua dai gia",
            "§eDao 1 cai la vo - Toc do ban tho",
            "§aTu dong sua chua - Khong bao gio hu",
            "§6Lenh: /cup"
        ));
        meta.setUnbreakable(true);
        // KHONG AN ENCHANT NUA - HIEN HET CHO NGAU
        meta.addEnchant(Enchantment.EFFICIENCY, 10, true);
        meta.addEnchant(Enchantment.FORTUNE, 5, true);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.addEnchant(Enchantment.UNBREAKING, 10, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        cup.setItemMeta(meta);
        return cup;
    }

    // ===== KIEM XIN =====
    public static ItemStack makeKiem() {
        ItemStack kiem = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = kiem.getItemMeta();
        meta.setDisplayName("§c§lKIEM THAN - CHET 1 HIT");
        meta.setLore(Arrays.asList(
            "§7Kiem cua trum server",
            "§eChem phat chet luon - Khong can chem lan 2",
            "§aTu dong sua chua - Khong bao gio hu",
            "§6Lenh: /kiem"
        ));
        meta.setUnbreakable(true);
        // KHONG AN ENCHANT NUA - HIEN HET CHO NGAU
        meta.addEnchant(Enchantment.SHARPNESS, 10, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
        meta.addEnchant(Enchantment.LOOTING, 5, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        meta.addEnchant(Enchantment.UNBREAKING, 10, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        kiem.setItemMeta(meta);
        return kiem;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player p)) return true;
        String c = cmd.getName().toLowerCase();
        if (c.equals("cup")) {
            p.getInventory().addItem(makeCup());
            p.sendMessage("§b§lDA NHAN CUP THAN!");
            return true;
        }
        if (c.equals("kiem")) {
            p.getInventory().addItem(makeKiem());
            p.sendMessage("§c§lDA NHAN KIEM THAN!");
            return true;
        }
        if (c.equals("supergear")) {
            p.getInventory().addItem(makeCup());
            p.getInventory().addItem(makeKiem());
            p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
            p.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 5));
            p.getInventory().addItem(new ItemStack(Material.TOTEM_OF_UNDYING, 2));
            p.sendMessage("§6§lDA NHAN FULL SUPERGEAR!");
            return true;
        }
        return true;
    }
}
