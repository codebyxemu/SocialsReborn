package me.xemu.socialsreborn;

import me.xemu.socialsreborn.api.SocialsAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialsReborn extends JavaPlugin
{

    private static SocialsAPI api;

    @Override public void onEnable()
    {
        api = new SocialsAPI();

        getLogger().info("Loading SocialsReborn");
    };

    @Override public void onDisable()
    {
        api = null;
    };

    public static SocialsAPI getAPI()
    {
        return api;
    };



};
