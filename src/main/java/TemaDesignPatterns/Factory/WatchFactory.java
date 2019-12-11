package TemaDesignPatterns.Factory;

public class WatchFactory {
    public static Watch getWatch(WatchType timing){
        switch (timing){
            case ANALOG:
                return new WatchAnalog();
            case SMART:
                return new WatchSmart();
        }
        throw new UnsupportedOperationException("Aia e!");
    }
}
