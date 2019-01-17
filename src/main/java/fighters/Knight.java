package fighters;

import fighters.Fighter;

public class Knight extends Fighter {
//    private double healthpoints;

    public Knight(double healthpoints, String name, WeaponType weapon) {
        super(healthpoints, name, weapon);
    }

    public void addArmour(){
        this.healthpoints += 20;
    }
}
