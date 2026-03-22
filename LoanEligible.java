package RealLifeProblem;

import java.util.*;

public class LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("salary : ");
        int salary = sc.nextInt();
        System.out.print("enter credit score : ");
        int creditScore = sc.nextInt();
        if (salary < 20000) {
            System.out.println(" not eligible ");
            return;
        } else if ((salary >= 20000) && (creditScore >= 650 && creditScore <= 749)) {
            System.out.print("eligible for = ₹" + 200000);
        } else if ((salary >= 20000) && (creditScore >= 750)) {
            System.out.print("eligible for = ₹" + 500000);

        } else {
            System.out.print(" not eligible for loan ");
        }

    }
}
