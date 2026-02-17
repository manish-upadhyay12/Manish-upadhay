package Arrray;

import java.util.Scanner;

public class MultiplyNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int  arr[] = new int[len];
        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int multiply= 1;
        for(int i = 0;i<len;i++){
            multiply*=arr[i];
        }
        System.out.print( multiply);
    }
}


