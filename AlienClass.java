import java.util.Random;

public class AlienClass {
    private final String name;
    private static Random r = new Random();
    public AlienClass(String name) {
        this.name = name + r.nextInt(100) + "   ";
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
