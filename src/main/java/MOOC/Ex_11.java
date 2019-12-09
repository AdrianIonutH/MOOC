package MOOC;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner nr1 = new Scanner(System.in);
        System.out.println("1 numar: ");
        int x = Integer.parseInt(nr1.nextLine());
        Scanner nr2 = new Scanner(System.in);
        System.out.println("2-lea numar: ");

        int y = Integer.parseInt(nr2.nextLine());

        int bigger = Math.max(x,y);
        if (x==y){
            System.out.println("Numerele sunt egale!");
        } else {
            System.out.println("Cel mai mare numar este: " + bigger);
        }
    }
}
