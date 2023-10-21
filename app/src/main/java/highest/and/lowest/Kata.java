package highest.and.lowest;

import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {

        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt()
                + " "
                + Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
    }
}
