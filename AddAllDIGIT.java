package Loops;
import java.util.*;
public class AddAllDIGIT {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        for(int  i = number;i>0;  i /=10) {  // dont use i++ becuase we dont increase it we want to sepratee number so use i/=10;
            int a = i % 10;
            sum += a;
        }
        System.out.print(sum);
    }
}
