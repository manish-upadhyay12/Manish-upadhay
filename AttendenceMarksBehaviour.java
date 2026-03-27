package RealLifeProblem;
import java.util.*;
public class AttendenceMarksBehaviour {
    public static void main(String[] args) {
        Scanner  ma = new Scanner(System.in);
        System.out.print("Enter subject: ");
		String subject = ma.nextLine();
        System.out.print("Enter number of Student :");  
        int n = ma.nextInt();  // take input how many student means length of array
    
        int arr[]  = new int[n];

        for(int i   = 0; i<arr.length; i++) {
            System.out.print("Student "+ (i+1)+ ":" + " Marks = " );
            arr[i] = ma.nextInt();   // Take input
        }

        int sum = 0;
        double Average = 0;
        int Highest  = -1;
        int lowest = 101;
        int passCount = 0;

        for(int i = 0; i<arr.length; i++) {
            int marks  = arr[i];
            if(arr[i]<=40) {

                System.out.print("Student " + (i+1) +":" + "marks  ="+ arr[i] +" "+": result = fail");  // for fail
                System.out.println();
            }
            else {

                System.out.print("Student " + (i+1) +":" + "marks  ="+ arr[i]+" " +" "+ ": result = Pass"); // for pass
                passCount++; // if pass then increase
                System.out.println();
            }


            if(marks>Highest) Highest = marks;  //  find highest marks
            if(marks<lowest) lowest = marks;   // find lowest marks 
            sum+= arr[i];                        // add all marks
        }
        Average = (double)sum/n;     /// find average of marks
         System.out.println("Class summary :" + " " + subject); 
        System.out.println("Highest marks  = " + Highest);   
        System.out.println("lowest marks  = " + lowest);
        System.out.println("Average marks  = " + Average +"%");
        System.out.println("Total pass  = " + passCount);

    }
}


