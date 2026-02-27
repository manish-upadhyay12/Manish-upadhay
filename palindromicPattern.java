package patternPrinting;
import java.util.*;
public class palindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int row = 1; row <= n; row++)   // represent row
        {
            for (int sp = 1; sp <= n - row; sp++)   //  show space
            {
                System.out.print("  ");
                 ///  print space
            }
            for (int col = 1; col <= row; col++) {   // show column
                System.out.print(col + " ");  /// print number in Right Aligned Half Pyramid Pattern form


            }
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j + " ");     // print number in left Aligned Half Pyramid Pattern form

            }
            System.out.println();   // next line after loop
        }
    }
}
