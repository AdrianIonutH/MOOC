package TemaDesignPatterns.Singleton;

public class Pass {
    private static Pass instance;
    private Pass (){

    }
    public static Pass getInstance(){
        if (instance == null){
            instance = new Pass();
        }
        return instance;
    }
}
