package me.xemu.socialsreborn;

import me.xemu.socialsreborn.api.SocialsAPI;
import me.xemu.socialsreborn.commands.DiscordCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialsReborn extends JavaPlugin
{

    private static SocialsAPI api;

    @Override public void onEnable()
    {
        api = new SocialsAPI();

        getLogger().info("Loading SocialsReborn");

        getLogger().info("Loading Commands");
        registerCommands();
        getLogger().info("Loaded Commands");
    };

    @Override public void onDisable()
    {
        api = null;
    };

    private void registerCommands()
    {
        getCommand("discord").setExecutor(new DiscordCMD());
    };

    public static SocialsAPI getAPI()
    {
        return api;
    };



};
