package me.xemu.socialsreborn.api;

import me.xemu.socialsreborn.SocialsReborn;

import java.util.List;

public class SocialsAPI
{

    private static SocialsReborn plugin;
    public SocialsAPI()
    {
        plugin = new SocialsReborn();
    };

    public void getConfigValue(String path, Object value)
    {
        plugin.getConfig().set(path, value);
    };

    public void reloadConfig()
    {
        plugin.reloadConfig();
    };

    public List<String> getAuthors()
    {
        return plugin.getDescription().getAuthors();
    };

    public String getLatestVersion()
    {
        return plugin.getDescription().getVersion();
    };

    public String getAPIVersion()
    {
        return plugin.getDescription().getAPIVersion();
    };

};