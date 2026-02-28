package ArrayQuestion;
import java.util.*;
public class TwoSumLeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your target :");
                                // take  target
        int target = sc.nextInt();  //
        int sum = 0;
        System.out.print("Enter your size of array :");
        int size = sc.nextInt(); // take size

        int num[] = new int[size]; // for array

        for(int i = 0; i<size; i++) {
            System.out.println("Enter your element of array :");
            num[i] = sc.nextInt();  // take input
        }
        for(int i = 0; i<(num.length-1); i++) {
            // i is starting value
            for(int j = (i+1); j<size; j++) { // j is addind value of i
                sum = num[i] + num[j];

                if(sum == target) {

                    System.out.println(i+","+(j));
                    return;
                }
            }
        }
                 	System.out.println("false");

    }
}
