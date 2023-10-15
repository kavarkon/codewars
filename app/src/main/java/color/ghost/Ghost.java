package color.ghost;

public class Ghost {

    private static final String[] COLORS = {"white", "yellow", "purple", "red"};
    private final String color;

    public Ghost() {
        this.color = COLORS[(int) (Math.random() * COLORS.length)];
    }

    public String getColor() {
        return color;
    }
}
