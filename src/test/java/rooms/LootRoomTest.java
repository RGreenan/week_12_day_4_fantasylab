package rooms;

import org.junit.Before;
import org.junit.Test;
import wizards.CreatureType;
import wizards.Warlock;

import static org.junit.Assert.*;

public class LootRoomTest {

    LootRoom lootRoom;
    Warlock warlock;

    @Before
    public void setUp() {
        lootRoom = new LootRoom("Get Coin", 70);
        warlock = new Warlock(75, "Ron", CreatureType.CAT);
    }


    @Test
    public void cantakePaymentInHealth() {
        lootRoom.takePaymentInHealth(warlock);
        assertEquals(60, warlock.getHealthpoints(), 0.01);
    }

    @Test
    public void canGetCoinTaken(){
        lootRoom.coinTaken(warlock);
        assertEquals(0, lootRoom.getCoins(), 0.01);
    }
}