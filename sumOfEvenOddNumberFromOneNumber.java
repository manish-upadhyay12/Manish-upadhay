package loop;

import java.util.Scanner;

public class sumOfEvenOddNumberFromOneNumber {

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find sum of even and odd like(12546) :");
        int  n= sc.nextInt();

        long evensum = 0;
        long oddsum = 0;
        for(int i =n;i>0;i/=10){
            int digit = i%10;
            if(digit%2==0){
                int even = digit;
                evensum+=even;

            }
            else if(digit%2==1){
                int odd = digit;
                oddsum+=odd;
            }

        }
        System.out.println("sum of even number is "+ evensum);
        System.out.print("sum of odd number is " +oddsum);


    }
}
