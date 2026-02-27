package patternPrinting;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give range to print pascal triangle: ");
        int n = sc.nextInt(); // take input

        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");   // print num
                num = num * (i - j) / (j + 1);    // formula for undating value of num
            }
            System.out.println();  // next line for printing next value
        }

    }
}
