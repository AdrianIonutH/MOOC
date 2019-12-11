package TemaDesignPatterns.Factory;

public class LaptopFactory {
    public static Laptop getLaptop (LaptopType specifications){
        switch (specifications){
            case BUSINESS:
                return new LaptopBusiness();
            case GAMING:
                return new LaptopGaming();
        }
        throw new UnsupportedOperationException("Nu-i!");
    }
}
