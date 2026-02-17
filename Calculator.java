package SwitchCase;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNUMBER = sc.nextInt();
        int secondNUMBER = sc.nextInt();
        char choice = sc.next().charAt(0);
        switch(choice){
            case '+' : System.out.println(firstNUMBER + secondNUMBER);
                 break;
            case '-' : System.out.println(firstNUMBER - secondNUMBER);
                break;
            case '*' : System.out.println(firstNUMBER * secondNUMBER);
                break;
            case '/' : System.out.println(firstNUMBER / secondNUMBER);
                break;
            case '%' : System.out.println(firstNUMBER % secondNUMBER);
                break;
            default :System.out.println("Invalid");
                break;
        }
    }
}
