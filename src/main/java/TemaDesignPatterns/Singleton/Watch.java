package TemaDesignPatterns.Singleton;

public class Watch {
    private static Watch instance;
    private Watch(){

    }
    public static Watch getInstance(){
        if (instance == null){
            instance = new Watch();
        }
        return instance;
    }
}
