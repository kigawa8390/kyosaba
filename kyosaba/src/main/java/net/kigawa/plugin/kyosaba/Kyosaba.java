package net.kigawa.plugin.kyosaba;

import net.kigawa.plugin.kyosaba.config.KyosabaConfig;
import net.kigawa.plugin.kyosaba.main.chiar.listener;
import net.kigawa.plugin.kyosaba.main.portal.commandPortalCreate;
import net.kigawa.plugin.kyosaba.main.portal.portalListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kyosaba extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager=getServer().getPluginManager();
        pluginManager.registerEvents(new listener(this),this);
        pluginManager.registerEvents(new portalListener(this),this);
        this.getCommand("portalCreate").setExecutor(new commandPortalCreate());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public int getConfigVersion(){
        return 1;
    }
}
