import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight(100, "Solaire", WeaponType.SWORD);
    }

    @Test
    public void hasArmour(){
        knight.addArmour();
        assertEquals(120, knight.getHealthpoints(), 0.01);
    }

}
