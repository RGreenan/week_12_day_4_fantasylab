import java.util.ArrayList;

public abstract class Mage extends Player {

    private ArrayList<SpellType> spells;
    private CreatureType creature;


    public Mage(double healthpoints, String name, CreatureType creature) {
        super(healthpoints, name);
        this.creature = creature;
        this.spells = new ArrayList<SpellType>();

        public ArrayList<SpellType> getSpells() {
            return spells;
        }

        public CreatureType getCreature(){
            return creature;
        }
    }
}
