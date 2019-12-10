package designPatterns.factory;

public class TelephoneFactory {

    public static Telephone getTelephone(TelephoneType choice){
        switch (choice) {
            case ROTARY:
                return new RotaryTelephone();
            case MOBILE:
                return new MobilePhone();
            case SMART:
                return new SmartPhone();
            case WATER:
                return new WaterTelephone();
        }
        throw new UnsupportedOperationException("Cannot offer any phone");
    }
}
