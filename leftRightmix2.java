package pattern;

import java.util.Scanner;

public class leftRightmix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            for (int sp = 1; sp <= (2 * n) - (2 * row) - 1; sp++) {
                System.out.print("  ");
            }
            if (row == n) {

                for (int col1 = 1; col1 < row; col1++) {
                    System.out.print(" *");
                }
            }
            else {
                for (int col = 1; col <= row; col++) {

                    System.out.print(" *");
                }
            }
                System.out.println();
            }

        }
    }

