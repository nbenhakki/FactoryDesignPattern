import java.util.ArrayList;
import java.util.Random;

public class VideoGame {
    public static AlienClass[] play() {
        AlienClass[] a = new AlienClass[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = AlienFactory.getAlienClass();
        }
        return a;
    }
}
