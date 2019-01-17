import org.junit.Before;
import org.junit.Test;
import wizards.CreatureType;
import wizards.SpellType;
import wizards.Warlock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    ArrayList<SpellType> spells;

    @Before
    public void before(){
        warlock = new Warlock(80, "Jezza", CreatureType.CAT);
    }

    @Test
    public void canAddCreaturePoints(){
        warlock.addCreaturePoints();
        assertEquals(100, warlock.getHealthpoints(), 0.01);
    }

    @Test
    public void canAddSpell(){
        warlock.addSpell(SpellType.FIREBALL);
        assertEquals(1, warlock.countSpells());
    }

    @Test
    public void canAddSpellPointsToHP(){
        warlock.addSpell(SpellType.FIREBALL);
        warlock.addSpellPoints();
        assertEquals(120, warlock.getHealthpoints(), 0.01);
    }
}
