package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void squareSum() {

        assertEquals(9, Kata.squareSum(new int[] {1,2,2}));
        assertEquals(5, Kata.squareSum(new int[] {1,2}));
        assertEquals(50, Kata.squareSum(new int[] {5,-3,4}));
        assertEquals(0, Kata.squareSum(new int[] {}));

    }
}