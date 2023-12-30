package angga7togk.shopgui;

import angga7togk.shopgui.command.SGCommand;
import angga7togk.shopgui.provider.Angga7Togk;
import angga7togk.shopgui.provider.OneBone;
import angga7togk.shopgui.provider.Provider;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;

public class ShopGUI extends PluginBase {

    public Config cfg;
    public Config shop;
    public static final String prefix = TextFormat.GRAY + "[Shop] " +TextFormat.RESET;

    private static Provider provider;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        
        String pvd = getConfig().getString("provider", "angga7togk");
        if (pvd.equalsIgnoreCase("onebone")) {
            provider = new OneBone();
        }else{
            provider = new Angga7Togk();
        }

        this.saveResource("shop.yml");
        this.shop = new Config(getDataFolder() + "/shop.yml", Config.YAML);
        this.getServer().getCommandMap().register("shop", new SGCommand(this));
    }

    public static Provider getProvider(){
        return provider;
    }
}
