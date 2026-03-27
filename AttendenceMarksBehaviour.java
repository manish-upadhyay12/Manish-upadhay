package RealLifeProblem;
import java.util.*;
public class AttendenceMarksBehaviour {
    public static void main(String[] args) {
        Scanner  ma = new Scanner(System.in);
        System.out.print("Enter number of Student :");
        int n = ma.nextInt();
        //		System.out.print("Enter subject :");
        String subject = ma.nextLine();
        int arr[]  = new int[n];

        for(int i   = 0; i<arr.length; i++) {
            System.out.print("Student "+ (i+1)+ ":" + " Marks = " );
            arr[i] = ma.nextInt();
        }

        int sum = 0;
        double Average = 0;
        int Highest  = -1;
        int lowest = 101;
        int passCount = 0;

        for(int i = 0; i<arr.length; i++) {
            int marks  = arr[i];
            if(arr[i]<=40) {

                System.out.print("Student " + (i+1) +":" + "marks  ="+ arr[i] +" "+": result = fail");
                System.out.println();
            }
            else {

                System.out.print("Student " + (i+1) +":" + "marks  ="+ arr[i]+" " +" "+ ": result = Pass");
                passCount++;
                System.out.println();
            }


            if(marks>Highest) Highest = marks;
            if(marks<lowest) lowest = marks;
            sum+= arr[i];
        }
        Average = (double)sum/n;
        System.out.println("Class summary");
        System.out.println("Highest marks  = " + Highest);
        System.out.println("lowest marks  = " + lowest);
        System.out.println("Average marks  = " + Average +"%");
        System.out.println("Total pass  = " + passCount);

    }
}


