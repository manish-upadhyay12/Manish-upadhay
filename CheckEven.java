package Loops;
import java.util.*;
public class CheckEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last number : ");
        int number = sc.nextInt();
      /* for(int i= 0;i<=number;i+=2){
        System.out.print(i);*/
        for(int i= 0;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
