package angga7togk.shopgui.utils;

import cn.nukkit.item.Item;

import java.util.HashMap;

import angga7togk.shopgui.ShopGUI;

public class SGUtils {

    private final ShopGUI plugin;

    public SGUtils(ShopGUI plugin){
        this.plugin = plugin;
    }

    public boolean categoryExists(String categoryName){
        return plugin.shop.exists("category." + categoryName) && plugin.shop.exists("shop." + categoryName);
    }

    public boolean itemExists(String categoryName, Item item){
        String itemIds = item.getId() + ":" + item.getDamage();
        return plugin.shop.exists("shop." + categoryName + "." + itemIds);
    }

    public void createCategory(String categoryName, Item item){
        String itemIds = item.getId() + ":" + item.getDamage();
        plugin.shop.set("category." + categoryName, itemIds);
        plugin.shop.set("shop." + categoryName, new HashMap<>());
        plugin.shop.save();
    }

    public void removeCategory(String categoryName){
        plugin.shop.getSection("category").remove(categoryName);
        plugin.shop.getSection("shop").remove(categoryName);
        plugin.shop.save();
    }

    public void addItem(String categoryName, Item item, int price){
        String itemIds = item.getId() + ":" + item.getDamage();
        plugin.shop.set("shop." + categoryName + "." + itemIds, price);
        plugin.shop.save();
    }

    public void removeItem(String categoryName, Item item){
        String itemIds = item.getId() + ":" + item.getDamage();
        plugin.shop.getSection("shop." + categoryName).remove(itemIds);
        plugin.shop.save();
    }
}
