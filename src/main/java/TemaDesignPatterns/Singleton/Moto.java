package TemaDesignPatterns.Singleton;

public class Moto {
    private static Moto instance;
    private Moto(){

    }
    public static Moto getInstance(){
        if (instance==null){
            instance = new Moto();
        }
        return instance;
    }
}
