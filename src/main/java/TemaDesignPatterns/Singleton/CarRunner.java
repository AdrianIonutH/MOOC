package TemaDesignPatterns.Singleton;

public class CarRunner {
    public static void main(String[] args) {
        Car c1 = Car.getInstance();
        System.out.println(c1);

        Car c2 = Car.getInstance();
        System.out.println(c2);
    }
}
