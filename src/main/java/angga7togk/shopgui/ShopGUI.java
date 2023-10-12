package angga7togk.shopgui;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;

public class ShopGUI extends PluginBase {

    public Config cfg;
    public Config shop;
    public static final String prefix = TextFormat.GRAY + "[Shop] " +TextFormat.RESET;
    @Override
    public void onEnable() {
        this.saveResource("shop.yml");
        this.shop = new Config(getDataFolder() + "/shop.yml", Config.YAML);
        this.getServer().getCommandMap().register("shop", new SGCommand(this));
    }
}
