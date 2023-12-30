package angga7togk.shopgui.provider;

import cn.nukkit.Player;
import me.onebone.economyapi.EconomyAPI;

public class OneBone implements Provider{

    @Override
    public double myMoney(Player player) {
        return EconomyAPI.getInstance().myMoney(player);
    }

    @Override
    public void setMoney(Player player, double money) {
        EconomyAPI.getInstance().setMoney(player, money);
    }

    @Override
    public void addMoney(Player player, double money) {
        EconomyAPI.getInstance().addMoney(player, money);
    }

    @Override
    public void reduceMoney(Player player, double money) {
        EconomyAPI.getInstance().reduceMoney(player, money);
    }
}
