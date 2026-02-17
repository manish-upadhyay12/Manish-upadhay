package Loops;

import java.util.Scanner;

public class PalindromeNumber {
    public  static  void main(String[] args){
        Scanner ma = new Scanner(System.in);
        int number = ma.nextInt();        //   reverse = 1,12,

        int orginal = number;
        int reverse = 0;
        for(int i = number;i>0;){
            int digit = i %10;
            reverse = reverse * 10 +digit;
             i/=10;
        }
        String result = (orginal == reverse) ? "palindrome" : "not palindrome";
        System.out.println(result);

    }
}
