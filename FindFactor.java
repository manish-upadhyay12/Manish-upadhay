package Loops;

import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count =0;
        for(int i =1;i<=number;i++){
            if(number%i==0){
                //count++;
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
