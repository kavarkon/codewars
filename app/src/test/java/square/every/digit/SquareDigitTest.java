package square.every.digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

    @Test
    void squareDigitsTest() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(493625, new SquareDigit().squareDigits(765));
        assertEquals(0 , new SquareDigit().squareDigits(0));
    }
}