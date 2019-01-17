package healers;

import org.junit.Before;
import org.junit.Test;
import wizards.CreatureType;
import wizards.Warlock;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    ArrayList<PotionType> potions;
    Warlock warlock;

    @Before
    public void setUp() {
        cleric = new Cleric(20, "Bob");
        warlock = new Warlock(80, "Sam", CreatureType.DRAGON);
    }

    @Test
    public void addPotionPoints() {
        cleric.addPotion(PotionType.SMALLHEAL);
        cleric.addPotionPoints();
        assertEquals(25, cleric.getHealthpoints(), 0.01);
    }

    @Test
    public void healPlayer() {
        cleric.addPotion(PotionType.MEDIUMHEAL);
        assertEquals(1, cleric.countPotions());
        cleric.healPlayer(PotionType.MEDIUMHEAL, warlock);
        assertEquals(0, cleric.countPotions());
        assertEquals(100, warlock.getHealthpoints(), 0.01);
    }
}