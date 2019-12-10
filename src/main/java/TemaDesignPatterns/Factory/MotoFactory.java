package TemaDesignPatterns.Factory;

public class MotoFactory {
    public static Moto getMoto(MotoType models){
        switch (models){
            case WITH2WHEELS:
                return new Moto2Weels();
            case WITH3WHEELS:
                return new Moto3Wheels();
        }
        throw new UnsupportedOperationException("N/A");
    }
}
