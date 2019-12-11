package TemaDesignPatterns.Factory;

public class BurgerFactory {
    public static Burger getBurger (BurgerType sortiment){
        switch (sortiment){
            case BURGERVEGAN:
                return new BurgerVegan();
            case BURGERCUDETOATE:
                return new BurgerCuDeToate();
        }
        throw new UnsupportedOperationException("Stoc limitat!");
    }
}
