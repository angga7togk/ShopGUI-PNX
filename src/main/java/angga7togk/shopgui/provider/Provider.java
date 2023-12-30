package angga7togk.shopgui.provider;

import cn.nukkit.Player;

public interface Provider {
    
    double myMoney(Player player);

    void setMoney(Player player, double money);

    void addMoney(Player player, double money);
    
    void reduceMoney(Player player, double money);
}
