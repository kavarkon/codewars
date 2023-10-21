package highest.and.lowest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void highAndLowTest1() {
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    void highAndLowTest2() {
        assertEquals("3 1", Kata.highAndLow("1 2 3"));
    }
}