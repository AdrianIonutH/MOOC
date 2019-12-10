package TemaDesignPatterns.Singleton;

public class MotoRunner {
    public static void main(String[] args) {
        Moto m1 = Moto.getInstance();
        System.out.println(m1);

        Moto m2 = Moto.getInstance();
        System.out.println(m2);
    }
}
