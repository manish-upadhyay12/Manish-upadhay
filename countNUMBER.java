package Loops;
import java.util.*;
public class countNUMBER {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int countNUMBER = sc.nextInt();
        int count = 0;
        for(int i = countNUMBER ; i>0;i/=10 ){
            int digit = i%10;
            count++;

        }
        System.out.print(count);

    }
}
