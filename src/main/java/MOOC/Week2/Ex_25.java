package MOOC.Week2;

import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number: ");
        read = reader.nextInt();
        sum = read;

        System.out.println("Type the second number: ");
        read = reader.nextInt();
        sum = sum+read;

        System.out.println("Type the third number: ");
        read = reader.nextInt();
        sum = sum+read;

        System.out.println("Sum: " + sum);
    }
}
