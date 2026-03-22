package RealLifeProblem;
import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("unit : ");
        int unit = sc.nextInt();
        int bill = 0;
        if (unit < 0) {
            System.out.println("Not Valid");
            return;
        }
        if ((unit >= 0 )&&(unit <= 100)) {
            bill = unit * 5;
        } else if ((unit > 100) &&( unit <= 300)) {
            bill = 100 * 5 + (unit - 100) * 7;

        } else {
            bill = (200) * 7 + (100 * 5) + (unit - 300) * 10;
        }

        System.out.print("totalBillAmount :" + bill);

    }
}