package pattern;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args){
        int n = 5;
        for(int row= n;row>=1;row--){
            for(int sp =1;sp<=n-row;sp++){
                System.out.print("   ");
            }
            for(int col= 1;col<=(2*row)-1;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
