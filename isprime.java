package SHEET1;

import com.sun.nio.sctp.SctpChannel;

import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 1) {
            System.out.println(" not prime");
            return;
        }

        for (int j = 2; j <= number; j++) {
            boolean isprime = true;

            for (int i = 2; i < j; i++) {

                if (j % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {
                System.out.println(j);
            }
        }
    }
}