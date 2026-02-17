package pattern;

import java.util.Scanner;

public class Triangle12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int anotherVARIABLE = 1;
        for (int row = 1; row <= number; row++) {   // define row
            for (int sp = 1; sp <= (number - row) ; sp++) {  // define space
                System.out.print("  ");
            }


            for (int col = 1; col <= 2 * row - 1; col++) {   ///  define column
                System.out.printf("%3d ",anotherVARIABLE);
                /// print 1 in whole triangle
                anotherVARIABLE++;



            }
            System.out.println();
        }
    }
}
