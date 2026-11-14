package com.supergear;

import org.bukkit.plugin.java.JavaPlugin;

public class SuperGearPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("cup").setExecutor(new SuperGearCommand());
        getCommand("kiem").setExecutor(new SuperGearCommand());
        getCommand("supergear").setExecutor(new SuperGearCommand());
        SuperGearCraft.registerRecipes(this);
        getLogger().info("SuperGear da bat! Co Cup + Kiem + Cong thuc che!");
    }
}
