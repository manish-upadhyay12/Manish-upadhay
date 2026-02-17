package FirstPracriceSheet1;

import java.util.Scanner;

public class EvenODD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check EvenOdd :");
        int number = sc.nextInt();
        for(int i =1;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
