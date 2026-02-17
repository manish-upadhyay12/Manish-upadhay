package Loops;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tem = number;  // transfer number
        int count = 0;
        for (int i = number; i >0 ; ) {
            int digit = i % 10;   // find count
            count++;  // last digit add in count
            i /= 10;
        }
        number = tem;  //  transfer number
        int sum = 0;

        for (int i = number; i>0; i /= 10) {
            int lastDIGIT = i % 10;  // find last digit
            int power =(int) Math.pow(lastDIGIT, count);  //find power of  seperate number
                sum+=power;

        }
        if (number == sum) {
            System.out.println("a armstrong number");
        } else {
            System.out.println(" not a armstrong number");
        }
    }
}
