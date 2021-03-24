package com.gmail.ursumajor1.plugin_1;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerInteractEvent;


public final class main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	@EventHandler
	public void onPlayerDamage(EntityDamageByEntityEvent e) {
		Entity damager = e.getDamager();
		Entity damageTaker = e.getEntity();
		getLogger().info("entity took damage");

		if (/*damager instanceof Player && */e.getCause().equals(DamageCause.PROJECTILE)) {
	    	damageTaker.setFireTicks(100);
	    	getLogger().info("fire tick has been done");
		}
	}
}