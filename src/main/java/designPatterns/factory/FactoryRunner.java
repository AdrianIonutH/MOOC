package designPatterns.factory;

import designPatterns.singleton.TelephoneRunner;

public class FactoryRunner {

    public static void main(String[] args) {
        Telephone phoneToBuy = null;

        TelephoneType choice = TelephoneType.WATER;

        phoneToBuy = TelephoneFactory.getTelephone(choice);

        phoneToBuy.call();
    }
}
