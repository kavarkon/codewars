package grasshopper.summation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHopperTest {

    @Test
    public void summationTest1() {
        assertEquals(1, GrassHopper.summation(1));
    }
    @Test
    public void summationTest2() {
        assertEquals(36, GrassHopper.summation(8));
    }
}
