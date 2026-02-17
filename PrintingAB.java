package pattern;

import java.util.Scanner;

public class PrintingAB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to print (AB) pattern :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {          // show row

            for (int j = 1; j <= n; j++) {          // show column
                if (i == 1 && j == (n / 2) + 1 || i > 1 && j == 1 || j == n && i > 1 || i == (n / 2) + 1) {    // condition of printing (A) pattern
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            //  A pattern printing complete
        }
        // start B pattern code
        for (int row = 1; row <= n; row++) {
// show row
            for (int col = 1; col <= n; col++) {
                // show column
                if (row == 1 || row == n || row == (n / 2) + 1 || col == 1 || col == n) {
                    // this condition  for printing star
                    if (row == 1 && col == n || row == n && col == n || row == (n / 2) + 1 && col == n) {    // this condition for avoid some place to print star
                        continue;
                    }
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
           // B pattern complete
        }
        System.out.println(" ");
        // C pattern start here
        for (int row = 1; row <= n; row++) {
            // define rpw
            for (int col = 1; col <= n; col++) {
                // define column
                if (row == 1 || row == n || col == 1) {
                                         // give instruction in which line star print
                    if((row==1&&col==1) || (row==n && col==1)){   // dont print this star
                        System.out.print("  ");
                    }

                        System.out.print(" -");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        // D pattern code start here
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1|| col==n) {
                    if((row==1&&col==n) || (row==n && col==n)){   // dont print this star
                        continue;
                    }
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
            /// D  pattern code end here
        }
        ///  E PATTERN START HERE
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                if(row==1|| row==n|| row==(n/2)+1|| col==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          ////  E PATTERN END HERE
        }
        /// F PATTERN STAART HER
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                if(row==1|| row==((n/2)+1)|| col==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           ///  F PATTERN END HERE
        }
        /// G PATTERN STAART HER
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                if(row==1|| row==n||( row>2&& col>3)|| col==1){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            ///  G PATTERN END HERE
        }
    }
}


