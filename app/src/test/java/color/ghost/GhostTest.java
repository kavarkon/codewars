package color.ghost;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GhostTest {
    private static final List<String> colors = new ArrayList<>();

    @BeforeAll
    public static void beforeAll() {
        colors.add("white");
        colors.add("yellow");
        colors.add("purple");
        colors.add("red");
    }

    @Test
    public void testGhostNotNull() {
        Ghost ghost = new Ghost();
        assertNotNull(ghost);
    }

    @Test
    public void testGhostContainsColor() {
        Ghost ghost = new Ghost();
        assertTrue(colors.contains(ghost.getColor()));
    }
}
