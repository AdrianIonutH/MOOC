package TemaDesignPatterns.Factory;

public class CarRunner {
    public static void main(String[] args) {
        Car carToBuy;
        Car carToBuy2;
        CarType variants = CarType.NONTURBO;
        carToBuy = CarFactory.getCar(variants);
        CarType variants2 = CarType.TURBO;
        carToBuy2 = CarFactory.getCar(variants2);
        carToBuy.Run();
        carToBuy2.Run();
    }
}
