package healers;

import players.Player;

import java.util.ArrayList;

public class Cleric extends Player {

    protected ArrayList<PotionType> potions;

    public Cleric(double healthpoints, String name) {
        super(healthpoints, name);
        this.potions = new ArrayList<>();
    }

    public ArrayList<PotionType> getPotions() {
        return potions;
    }

    public void addPotion(PotionType potion){
        potions.add(potion);
    }

    public int countPotions(){
       return potions.size();
    }

    public void addPotionPoints() {
        double total = 0;
        for ( PotionType potion : potions) {
            total += potion.getPoints();
        }
        healthpoints += total;
    }

    public void removePotion(PotionType potion){
        potions.remove(potion);
    }

    public void healPlayer(PotionType potion, Player player){
        double ppoints = potion.getPoints();
        double playerHP = player.getHealthpoints();
        double newhp = ppoints += playerHP;
        player.setHealthpoints(newhp);
        removePotion(potion);
    }
}
