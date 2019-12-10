package TemaDesignPatterns.Singleton;

public class Laptop {
    private static Laptop instance;
    private Laptop (){

    }
    public static Laptop getInstance(){
        if (instance == null){
            instance = new Laptop();
        }
        return instance;
    }
}
