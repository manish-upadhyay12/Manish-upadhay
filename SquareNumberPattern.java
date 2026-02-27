package patternPrinting;
import java.util.*;
public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Print Square Number Pattern : ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        // define row
        {

            for (int col = n; col>=1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
