package conditionalStatement;
import java.util.*;
public class ToFindWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date to find weekday : ");
        int weekNUMBER = sc.nextInt();
        switch (weekNUMBER) {
            case 19:
                System.out.print("Monday");
                break;
            case 20:
                System.out.print("Tuesday");
                break;
            case 21:
                System.out.print("Wednesday");
                break;
            case 22:
                System.out.print("Thursday");
                break;
            case 23:
                System.out.print("Friday");
                break;
            case 24:
                System.out.print("Saturday");
                break;
            case 25:
                System.out.print("Sunday");
                break;
            case 26:
                System.out.print("  Monday");
                break;
            case 27:
                System.out.print("Tuesday");
                break;
            case 28:
                System.out.print(" Wednesday");
                break;
            case 29:
                System.out.print(" Thursday");
                break;
            case 30:
                System.out.print(" Friday");
                break;
            case 31:
                System.out.print(" Satarday");
                break;
        }
    }
}
