package conditionalStatement;
/*
"FizzBuzz" if i is divisible by 3 and 5,
        "Fizz" if i is divisible by 3,
        "Buzz" if i is divisible by 5
        "i" as a string, if none of the conditions are true.
        */
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println( number);
        }
    }
}