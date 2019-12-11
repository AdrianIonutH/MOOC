package TemaDesignPatterns.Factory;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptopToBuy;
        LaptopType specifications = LaptopType.GAMING;
        laptopToBuy = LaptopFactory.getLaptop(specifications);
        laptopToBuy.power();

        Laptop laptopToBuy2;
        LaptopType specifications2 = LaptopType.BUSINESS;
        laptopToBuy2 = LaptopFactory.getLaptop(specifications2);
        laptopToBuy2.power();
    }
}
