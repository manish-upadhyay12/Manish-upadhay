package Calendar;
import java.time.*;
import java.util.*;
public class firstCalendar {


  //  public class CompleteCalendar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LocalDate today = LocalDate.now();

            System.out.print("Month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Year: ");
            int year = sc.nextInt();

            printCalendar(year, month);
        }

        static void printCalendar(int year, int month) {
            LocalDate firstDay = LocalDate.of(year, month, 1);
            int daysInMonth = firstDay.lengthOfMonth();
            DayOfWeek startDay = firstDay.getDayOfWeek();

            // Header
            System.out.println("\n   " + firstDay.getMonth() + " " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            // Empty spaces
            for (int i = 1; i < startDay.getValue(); i++) {
                System.out.print("   ");
            }

            // Days
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);
                if ((day + startDay.getValue() - 1) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

    }

