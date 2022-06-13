import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void addDrink() {
        assertEquals(110, waterBottle.addDrink());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillsVolumeAgain() {
        assertEquals(100, waterBottle.fillsVolumenAgain());
    }
}
