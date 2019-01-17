public class Warlock extends Mage{

    public Warlock(double healthpoints, String name, CreatureType creature) {
        super(healthpoints, name, creature);
    }

    public void addCreaturePoints(){
        healthpoints += getCreature().getPoints();
    }

    public void addSpell(SpellType spell){
        spells.add(spell);
    }


}
