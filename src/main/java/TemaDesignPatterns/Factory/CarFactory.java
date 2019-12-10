package TemaDesignPatterns.Factory;

public class CarFactory {

    public static Car getCar (CarType variants){
        switch (variants){
            case TURBO:
                return new CarTurbo();
            case NONTURBO:
                return new CarNonTurbo();
        }
        throw new UnsupportedOperationException("N'are fratele tau altceva!");
    }
}
