package wizards;

import players.Player;

import java.util.ArrayList;

public abstract class Mage extends Player {

    private CreatureType creature;

    public Mage(double healthpoints, String name, CreatureType creature) {
        super(healthpoints, name);
        this.creature = creature;
    }

        public CreatureType getCreature(){
            return creature;
        }
}
