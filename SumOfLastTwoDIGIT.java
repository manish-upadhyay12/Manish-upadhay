package SHEET1;

import java.util.Scanner;

public class SumOfLastTwoDIGIT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int lastNUMBER = number%100;
        int  tem = lastNUMBER;
        for(int i = tem;i>0;i/=10){
           int digit = i%10;
         sum+=digit;

        }
        System.out.println(sum);
    }
}
