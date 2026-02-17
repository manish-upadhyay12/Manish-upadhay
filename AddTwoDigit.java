package LeadCodeQuestion;
import java.util.*;
public class AddTwoDigit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int lastSUM = 0;
        for(int i = num;i>0;){   /// i will never be  >= to zero only (>) because when num is zero so i always be true
            int digit = i%10;
            sum+=digit;
            i/=10;
        }
        if(sum>=0&&sum<10){
            System.out.println(sum);
        }
        else{
            for(int i = sum;i>0;i/=10){
                int digit = i%10;
                lastSUM+=digit;
            }
            System.out.println(lastSUM);
        }

    }
}


