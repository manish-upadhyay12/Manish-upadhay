package RealLifeProblem;

import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Year of  service : ");
        int service = sc.nextInt();

        System.out.print("performance rating : ");
        int performanceRating = sc.nextInt();

        int Bonus = 0;
        if (service < 1) {
            Bonus = 0;

        } else if (service <= 3) {

            if (performanceRating >= 4)
                Bonus = 5000;
            else {
                Bonus = 2000;
            }
        } else if (service > 3) {
            if (performanceRating >= 4) {
                Bonus = 10000;
            } else {
                Bonus = 5000;
            }
        } else {
            System.out.print("focus on work ");
        }

        System.out.print("Bonus  : " + Bonus);

    }
    }
