package TemaDesignPatterns.Singleton;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = Laptop.getInstance();
        System.out.println(l1);

        Laptop l2 = Laptop.getInstance();
        System.out.println(l2);
    }
}
