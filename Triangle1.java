package pattern;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int anotherNUMBER = 1;

        for(int row= 1;row<=number;row++){     // define row

            for(int sp =1;sp<=number-row;sp++){  // define space
                System.out.print(" ");
            }
            for(int col=1;col<=2*row  ;col++){
               ///  define column
                System.out.print( anotherNUMBER+" ");    /// print 1 in whole triangle
                anotherNUMBER++;
            }
            System.out.println();
        }
    }
}
