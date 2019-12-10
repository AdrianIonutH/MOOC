package TemaDesignPatterns.Factory;

public class MotoRunner {
    public static void main(String[] args) {
        Moto motoToBuy;
        MotoType models = MotoType.WITH2WHEELS;
        motoToBuy = MotoFactory.getMoto(models);
        motoToBuy.runFast();

        Moto motoToBuy2;
        MotoType models2 = MotoType.WITH3WHEELS;
        motoToBuy2 = MotoFactory.getMoto(models2);
        motoToBuy2.runFast();
    }
}
