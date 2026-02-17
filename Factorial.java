package SHEET1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check factorial :");
        int number = sc.nextInt();
        int product = 1;
        for (int i = number; i > 0; i--) {
            product *= i;

        }
        System.out.println("factorial "+ product);
    }
    }
