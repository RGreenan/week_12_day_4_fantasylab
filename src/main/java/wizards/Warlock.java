package wizards;

import wizards.Mage;

import java.util.ArrayList;

public class Warlock extends Mage {

    private ArrayList<SpellType> spells;

    public Warlock(double healthpoints, String name, CreatureType creature) {
        super(healthpoints, name, creature);
        this.spells = new ArrayList<>();
    }

    public ArrayList<SpellType> getSpells(){
        return spells;
    }

    public int countSpells(){
        return spells.size();
    }

    public void addCreaturePoints(){
        healthpoints += getCreature().getPoints();
    }

    public void addSpell(SpellType spell){
        spells.add(spell);
    }


    public void addSpellPoints() {
        double total = 0;
        for ( SpellType spell : spells) {
            total += spell.getPoints();
        }
        healthpoints += total;
    }
}
