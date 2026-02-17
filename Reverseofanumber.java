package Loops;

import java.util.Scanner;

public class Reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        for (int i = number; i > 0;  i/=10) {
            int digit =i %10;
            reverse = reverse *10 +digit;


        }
        System.out.println(reverse);
    }
}