package Loops;
import java.util.*;
public class reaverseSeprerateDigit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        for(;number>0;){
           int digit = number%10;
        //    int savedVAULE = digit;
            System.out.println( digit + " ");
            sum += digit;
            number /=10;


        }
        System.out.println("sum of all digit is "+sum);
    }
}
