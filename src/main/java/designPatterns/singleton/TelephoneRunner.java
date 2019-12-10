package designPatterns.singleton;

public class TelephoneRunner {

    public static void main(String[] args) {
        Telephone t1 = Telephone.getInstance();

        System.out.println(t1);

        Telephone t2 = Telephone.getInstance();

        System.out.println(t2);

    }
}
