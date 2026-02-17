package SHEET1;

import java.util.Scanner;

public class SumOFevenOrodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // take input for both even or odd
        int sum = 0;
        for (int even = 1; even <= number; even++) {
            if (even % 2 == 0) {
                sum += even;  // add even number
            }

        }
        System.out.println(sum);
        for (int odd = 1; odd <= number; odd++) {
            if (odd % 2 == 1) {
                sum += odd;  /// add odd number
            }

        }
        System.out.println(sum);
    }
    }
