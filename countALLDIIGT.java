package SHEET1;

import java.util.Scanner;

public class countALLDIIGT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to count digit : ");

        int number = sc.nextInt();
        int count = 0;
        for (int i = number; i > 0; i/=10) {
            int digit = i % 10;
            count++;
        }
        System.out.println(count);

    }
}