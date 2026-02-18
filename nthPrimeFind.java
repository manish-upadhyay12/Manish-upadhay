package HardProblemSolving;

import java.util.Scanner;

public class nthPrimeFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int lastnth =1;
        if(n<=0)
        {
            System.out.println("invalid input");
            return;
        }
        for(int i =2; count<n; i++) {   //  count<n means  go to n value in last if prime so it will increase
            boolean isprime = true;
            for(int check = 2; check<i; check++) {
                if(i%check==0) {
                    isprime = false;  // if divisible so is prime false
                    break;   // break loop if isprime is false
                }
            }
            if(isprime) {  /// is prime = true
                //    System.out.println(last =i);
                lastnth=i;    // prime number store  in lastnth variable
                count++;    // if number is prime countinue increase outherwise not increase
            }
        }

        System.out.println(lastnth);   /// print last  nth prime number


    }
}
