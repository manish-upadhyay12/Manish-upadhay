package TenaryOperator;
import java.util.*;
public class firstcode {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  a =sc.nextInt();
        int  b =sc.nextInt();
        int  c =sc.nextInt();
 //       data type variable = condition ? true : condition : true : false;
       int result =  a>b  && a>c ? a : b>c &&b>a ? b : c;
        System.out.println(result);
    }
}
