package collinearity;

public class Kata {
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) return true;
        if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) return true;
        if (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
            return ((double) x1 / (double) x2) == ((double) y1 / (double) y2);
        }
        return false;
    }

    //clever solution: return x1 * y2 == y1 * x2;
}
