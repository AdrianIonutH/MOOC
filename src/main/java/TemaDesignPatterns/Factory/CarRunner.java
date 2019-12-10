package TemaDesignPatterns.Factory;

public class CarRunner {
    public static void main(String[] args) {
        Car carToBuy = null;
        CarType variants = CarType.NONTURBO;
        carToBuy = CarFactory.getCar(variants);
        carToBuy.Run();
    }
}
