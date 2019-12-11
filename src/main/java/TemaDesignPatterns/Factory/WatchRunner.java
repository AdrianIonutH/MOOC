package TemaDesignPatterns.Factory;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watchToBuy;
        WatchType timing = WatchType.ANALOG;
        watchToBuy = WatchFactory.getWatch(timing);
        watchToBuy.showTheTime();

        Watch watchToBuy2;
        WatchType timing2 = WatchType.SMART;
        watchToBuy2 = WatchFactory.getWatch(timing2);
        watchToBuy2.showTheTime();
    }
}
