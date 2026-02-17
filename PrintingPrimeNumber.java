package Loops;
import java.util.*;


public class PrintingPrimeNumber {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n<1) {
                System.out.println("not prime");
                return;
            }


            for(int j = 2; j<=n; j++) {
                boolean isprime = true;
                for(int i = 2; i<j; i++) {
                    if(j%i==0) {
                        isprime = false;
                        break;

                    }

                }
                if(isprime)
                {
                    System.out.println(j );
                }
            }
        }
    }

