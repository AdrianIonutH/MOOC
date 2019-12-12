package MOOC.Week1;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.println("Adrian Hristea" + "\n");

        System.out.println("Hello world!" + "\nAnd all the people around the world!\n");

        for (int i = 0; i <= 10; i++) {

            switch (i) {
                case 1:

                    System.out.println("    *    ");
                    break;
                case 2:
                case 3:

                    System.out.println("   ***   ");
                    break;

                case 5:

                    System.out.println("  *****  ");
                    break;

                case 7:

                    System.out.println(" ******* ");
                    break;

                case 9:

                    System.out.println("*********");
                    break;
                case 10:

                    System.out.println("    *    ");
                    break;
            }

        }
    }
}
