package TemaDesignPatterns.Factory;

public class BurgerRunner {
    public static void main(String[] args) {
        Burger placintel;
        BurgerType sortiment = BurgerType.BURGERCUDETOATE;
        placintel = BurgerFactory.getBurger(sortiment);
        placintel.comestibil();

        Burger placintel2;
        BurgerType sortiment2 = BurgerType.BURGERVEGAN;
        placintel2 = BurgerFactory.getBurger(sortiment2);
        placintel2.comestibil();
    }
}
