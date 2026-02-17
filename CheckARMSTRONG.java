package Loops;

import java.util.*;

 // a = 1234
        public class CheckARMSTRONG {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number  = sc.nextInt();
            int temp = number;
            int count = 0;
            for(;number>0;number/=10){
                int digit = number%10;
                count++;
            }
            number = temp;
            int sum = 0;
            for(;number>0;){
                int separateDIGIT = number%10;
                double power = Math.pow(separateDIGIT,count);
                sum+=power;
                number/=10;
            }
                 String result= sum== temp ? "It is a armstrong number":" it is not a armstrong number";
            System.out.println(result);









        }
}
