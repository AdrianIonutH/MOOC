package MOOC;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Introduceti raza: ");
        double r = x.nextDouble();
        double area = 2*Math.PI*r;

        System.out.println("Raza este: " + area);
    }
}
