package vowel.count;

import java.util.Arrays;
import java.util.stream.Stream;

public class Vowels {
    public static int getCount(String str) {
        return (int) Stream.of(str.split(""))
                .filter(ch -> Arrays.asList("a", "e", "i", "o", "u").contains(ch))
                .count();
        //clever solution: str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
