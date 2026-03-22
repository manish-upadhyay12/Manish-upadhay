package RealLifeProblem;

import java.util.*;

public class OverTimeSallary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String name = sc.nextLine();
        System.out.print(" enter working hour per week :");
        int hour = sc.nextInt();
        System.out.print(" enter fix hour per week :");
        int perWeekHour = sc.nextInt();
        int overtime = 0;
        if (hour > perWeekHour) {
            overtime = hour - perWeekHour;  // find overtime
        }
        int amount = 0;  // initially amount is 0;
        if (hour <= perWeekHour) {
            amount = hour * 500;   // amount of working hour is less Then 40
        } else if ((hour > perWeekHour) && (hour <= 60)) {
            amount = (hour - perWeekHour) * 750 + (perWeekHour * 500);  // find total amount perWeekHour and overtime

        } else {
            amount = (perWeekHour*500) + ( (hour -  perWeekHour)*750) ;
        }
        System.out.println();
        System.out.println("Name of employee :" + name);
        System.out.println("over time hour :" + overtime);
        System.out.println("Total working hour :" + hour);
        System.out.print("Total amount :" + amount);
    }
}

