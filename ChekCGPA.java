package conditionalStatement;
import java.util.*;
public class ChekCGPA {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage that you eant to check: ");
        float studentCGPA = sc.nextFloat();

        if(studentCGPA>=9){
            System.out.print("BIKE");
        }
        else if(studentCGPA>=8&&studentCGPA<=9){
            System.out.print("phone");
        }
        else if(studentCGPA >4 && studentCGPA<8){
            System.out.println("keypad phone");
        }
        else{
            System.out.println("chappal");
        }



    }
}
