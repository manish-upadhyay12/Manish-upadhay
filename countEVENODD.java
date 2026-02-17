package SHEET1;

import java.util.Scanner;

public class countEVENODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int count=0;
        for (int even =1 ; even <= number1; even++) {
            if (even % 2 == 0) { // check even number
             System.out.println(even);  //print even number

            } else {
               continue;  // odd to continue;
            }
        }

        for (int odd =1 ; odd <= number2; odd++) {
            if (odd% 2 == 1) {  // check odd number
                System.out.print(odd+" ");  //print odd number

            } else {
                continue; //  if even  continue
            }
        }
    }
}