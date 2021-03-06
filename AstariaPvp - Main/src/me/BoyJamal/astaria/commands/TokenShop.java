package me.BoyJamal.astaria.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.BoyJamal.astaria.utils.GuiManager;
import me.BoyJamal.astaria.utils.StorageManager;

public class TokenShop implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (!(sender instanceof Player))
		{
			return true;
		}
		Player p = (Player)sender;
		for (GuiManager mang : StorageManager.activeGuis)
		{
			if (mang.getType().equalsIgnoreCase("tokenshop"))
			{
				p.openInventory(mang.toInventory());
				p.playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 500, 500);
			}
		}
		return true;
	}
	
}
