package pattern;

import java.util.Scanner;

public class rightBothSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 7;// input for printing row

        for (int row = 1; row <= (number / 2)+1 ; row++) {
            // (number/2)+1 decide how many row print in upper half
            // row decide and half of row
            for (int col = 1; col <= row; col++) {               //   colulmn decide and half of row
                     System.out.print("*");                           //   print left angle star
        }
             for(int sp =1;sp<=(number-2*row)+1;sp++) {           // print space between both angle
                     System.out.print(" ");                               // print space between both angle

        }
            for (int col = 1; col <= row; col++) {                    // decide second angle star and then
                     System.out.print("*");                                  // print star
        }
                     System.out.println();
                // give next line to upper half
        }
            for(int row=((number-1)/2 );row>=1;row--)
        {                    //  lower left design row
            for(int col =1;col<=row;col++){                                // lower left design column
                     System.out.print("*");                                     // print space
        }
            for(int sp = 1;sp<=(number-2*row)+1;sp++){
                     System.out.print(" ");
        }
            for(int col =1;col<=row;col++){
                     System.out.print("*");
        }
                    System.out.println();


        }

        }
        }
