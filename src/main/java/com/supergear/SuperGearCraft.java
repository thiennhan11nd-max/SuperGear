package com.supergear;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class SuperGearCraft {
    public static void registerRecipes(JavaPlugin plugin) {

        // ===== CUP THAN =====
        // NNN /  S  /  S
        ShapedRecipe rCup = new ShapedRecipe(new NamespacedKey(plugin, "cup_than"), SuperGearCommand.makeCup());
        rCup.shape("NNN", " S ", " S ");
        rCup.setIngredient('N', Material.NETHERITE_INGOT);
        rCup.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(rCup);

        // ===== KIEM THAN =====
        // DND / DND /  S
        ShapedRecipe rKiem = new ShapedRecipe(new NamespacedKey(plugin, "kiem_than"), SuperGearCommand.makeKiem());
        rKiem.shape("DND", "DND", " S ");
        rKiem.setIngredient('D', Material.DIAMOND_BLOCK);
        rKiem.setIngredient('N', Material.NETHERITE_INGOT);
        rKiem.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(rKiem);

        Bukkit.getLogger().info("§aDa dang ky Cong thuc Cup + Kiem Than!");
    }
}
