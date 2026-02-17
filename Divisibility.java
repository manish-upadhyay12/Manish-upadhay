package FirstPracriceSheet1;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to check exact multiple: ");
        int  N = sc.nextInt();
        System.out.print("Enter M : ");
        int  M = sc.nextInt();
        if(N%M==0){
            System.out.println("N is exact multiply of M ");
        }
        else{
            System.out.println("N is not exact multiply of M ");

        }
    }
}
