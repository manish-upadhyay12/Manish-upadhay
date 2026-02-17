package Loops;

import java.util.Scanner;

public class FibonaSeries {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int firstNUMBER = 0;
        int secondNUMBER = 1;
        int sum=0;
        for(int i = 0;i<number;i++){


         sum = firstNUMBER + secondNUMBER;

         // System.out.println(sum);
            firstNUMBER =secondNUMBER;

            secondNUMBER = sum;

        }
        System.out.println(firstNUMBER);
    }
}
