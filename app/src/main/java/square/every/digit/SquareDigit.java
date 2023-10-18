package square.every.digit;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(Stream.of(String.valueOf(n).split(""))
                .map(ch -> Integer.parseInt(ch) * Integer.parseInt(ch))
                .map(Object::toString)
                .collect(Collectors.joining()));
    }
}
