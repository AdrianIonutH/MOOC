package MOOC;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner nr1 = new Scanner(System.in);
        System.out.println("Introduceti 1 nr: ");
        int x = Integer.parseInt(nr1.nextLine());
        Scanner nr2 = new Scanner(System.in);
        System.out.println("Introduceti al 2lea nr: ");
        int y = Integer.parseInt(nr2.nextLine());

        if (x < y){
            System.out.println("Cel mai mare nr este: " + y);
        } else if (y < x){
            System.out.println("Cel mai mare nr este: " + x);
        } else {
            System.out.println("Numerele sunt egale!");
        }
    }
}
