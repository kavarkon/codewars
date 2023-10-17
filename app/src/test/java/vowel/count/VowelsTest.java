package vowel.count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getCountTest() {
        assertEquals(5, Vowels.getCount("abracadabra"));
        assertEquals(0, Vowels.getCount(""));
        assertEquals(4, Vowels.getCount("pear tree"));
        assertEquals(13, Vowels.getCount("o a kak ushakov lil vo kashu kakao"));
    }
}