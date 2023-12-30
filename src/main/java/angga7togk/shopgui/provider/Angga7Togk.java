package angga7togk.shopgui.provider;

import angga7togk.economyapi.database.EconomyDB;
import cn.nukkit.Player;

public class Angga7Togk implements Provider{

    @Override
    public double myMoney(Player player) {
        return EconomyDB.myMoney(player);
    }

    @Override
    public void setMoney(Player player, double money) {
        EconomyDB.setMoney(player,(int) money);
    }

    @Override
    public void addMoney(Player player, double money) {
        EconomyDB.addMoney(player,(int) money);
    }

    @Override
    public void reduceMoney(Player player, double money) {
        EconomyDB.reduceMoney(player,(int) money);
    }
}
