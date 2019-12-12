package MOOC.Week1;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti 1 nr: ");
        int x = Integer.parseInt(in.nextLine());
        Scanner in2 = new Scanner(System.in);
        System.out.println("Introduceti al 2-lea nr: ");
        int y = Integer.parseInt(in2.nextLine());
        double z = Double.parseDouble(String.valueOf(x)) / Double.parseDouble(String.valueOf(y));

        System.out.println("Diferenta dintre cele 2 este: " + z);
    }
}
