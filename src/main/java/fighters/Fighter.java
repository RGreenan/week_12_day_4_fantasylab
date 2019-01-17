package fighters;

import players.Player;

public abstract class Fighter extends Player {
    private WeaponType weapon;

    public Fighter(double healthpoints, String name, WeaponType weapon) {
        super(healthpoints, name);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
