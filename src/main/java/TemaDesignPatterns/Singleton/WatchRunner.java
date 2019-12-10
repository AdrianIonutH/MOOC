package TemaDesignPatterns.Singleton;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w1 = Watch.getInstance();
        System.out.println(w1);

        Watch w2 = Watch.getInstance();
        System.out.println(w2);
    }
}
