package rooms;

import players.Player;

public class LootRoom extends Room {

    private double coins;

    public LootRoom(String name, double coins) {
        super(name);
        this.coins = coins;
    }

    public double getCoins() {
        return coins;
    }

    public void removeCoins() {
        coins = 0;
    }

    public void takePaymentInHealth(Player player){
        double playerHP = player.getHealthpoints();
        double newhp = playerHP -= 15;
        player.setHealthpoints(newhp);
    }

    public void coinTaken(Player player){
        takePaymentInHealth(player);
        removeCoins();
    }
}
