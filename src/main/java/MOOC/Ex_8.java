package MOOC;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti 1 nr: ");
        int number = Integer.parseInt(in.nextLine());
        Scanner in2 = new Scanner(System.in);
        System.out.println("Introduceti al 2-lea nr: ");
        int number2 = Integer.parseInt(in2.nextLine());
        int sum = Integer.parseInt(String.valueOf(number)) + Integer.parseInt(String.valueOf(number2));
        System.out.println("Suma dintre cele 2 este: " + sum);
    }
}
