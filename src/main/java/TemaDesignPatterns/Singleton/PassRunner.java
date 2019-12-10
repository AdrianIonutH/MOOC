package TemaDesignPatterns.Singleton;

public class PassRunner {
    public static void main(String[] args) {
        Pass p1 = Pass.getInstance();
        System.out.println(p1);

        Pass p2 = Pass.getInstance();
        System.out.println(p2);
    }
}
