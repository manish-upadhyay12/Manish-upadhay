package conditionalStatement;
import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print("User given number"+n +"even number");
        } else {
            System.out.print("User given number"+n +"odd number");
        }
    }
}
