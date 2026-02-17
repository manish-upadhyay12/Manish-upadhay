package pattern;

import java.util.Scanner;

public class ReverseRIGHT {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = 5;
        for(int row= number;row>=1;row--){
            for(int sp=1;sp<=number-row;sp++){

                System.out.print(" ");
                }
            for(int j= 1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
