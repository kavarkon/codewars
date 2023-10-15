package grasshopper.summation;

import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {

        return IntStream.rangeClosed(1, n).sum();
        //clever solution: n*(n+1)/2
    }
}
