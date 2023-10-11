public class AlienClassTester {
    public static void main(String[] args) {
        VideoGame v = new VideoGame();
        for(int i = 0; i < v.play().length; i++) {
            System.out.println(v.play()[i]);
        }
    }
}
