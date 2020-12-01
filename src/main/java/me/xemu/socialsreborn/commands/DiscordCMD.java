package me.xemu.socialsreborn.commands;

import me.xemu.socialsreborn.SocialsReborn;
import me.xemu.socialsreborn.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCMD implements CommandExecutor
{

    private final SocialsReborn plugin;
    public DiscordCMD()
    {
        this.plugin = new SocialsReborn();
    };

    private boolean permissionEnabled = false;
    private String permission = "";

    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            if(plugin.getConfig().getBoolean("Discord.PermissionEnabled") == true && plugin.getConfig().getString("Discord.Permission") != "")
            {
                permissionEnabled = true;
                permission = plugin.getConfig().getString("Discord.Permission");
            };

            final Player player = (Player) sender;
            if(permissionEnabled)
            {
                if(player.hasPermission(permission))
                {
                    player.sendMessage(Utils.chat(plugin.getConfig().getString("Discord.Output").replaceAll("<link>", plugin.getConfig().getString("Discord.Link"))));
                } else {
                    player.sendMessage(Utils.chat(plugin.getConfig().getString("Error.NoPermission")));
                };
            } else {
                player.sendMessage(Utils.chat(plugin.getConfig().getString("Discord.Output").replaceAll("<link>", plugin.getConfig().getString("Discord.Link"))));
            };
        };
        return true;
    };
};