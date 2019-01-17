package rooms;

import org.junit.Before;
import org.junit.Test;
import wizards.CreatureType;
import wizards.SpellType;
import wizards.Warlock;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CombatRoomTest {

    CombatRoom combatRoom;
    Warlock warlock;
    ArrayList<SpellType> spells;
    ArrayList<EnemyType> enemys;

    @Before
    public void setUp() {
        combatRoom = new CombatRoom("Fight");
        warlock = new Warlock(70, "Ron", CreatureType.DRAGON);
    }

    @Test
    public void getEnemy() {
        combatRoom.addEnemy(EnemyType.GOBLIN);
        assertEquals(1, combatRoom.countEnemys());
        assertEquals(EnemyType.GOBLIN, combatRoom.getEnemy(EnemyType.GOBLIN));
    }

    @Test
    public void canWinFight(){
        combatRoom.addEnemy(EnemyType.GOBLIN);
        combatRoom.addPlayer(warlock);
        assertEquals("Player Wins", combatRoom.fightEnemy(EnemyType.GOBLIN, warlock));
        assertEquals(50, warlock.getHealthpoints(), 0.01);
    }

    @Test
    public void canLoseFight(){
        combatRoom.addEnemy(EnemyType.SIREN);
        combatRoom.addPlayer(warlock);
        assertEquals("Enemy Wins. Player is out of HP", combatRoom.fightEnemy(EnemyType.SIREN, warlock));
        assertEquals(0, warlock.getHealthpoints(), 0.01);

    }

    @Test
    public void canHaveRandomFight(){
        combatRoom.addPlayer(warlock);
        combatRoom.addEnemy(EnemyType.GOBLIN);
        combatRoom.addEnemy(EnemyType.SIREN);
        combatRoom.addEnemy(EnemyType.MIMIC);
        combatRoom.addEnemy(EnemyType.ULTIMATEWEAPON);
        combatRoom.addEnemy(EnemyType.TROLL);
        combatRoom.fightRandomEnemy(warlock);
    }
}