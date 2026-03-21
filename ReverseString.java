package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine(); // length of string
        StringBuilder st = new StringBuilder(str);   // class StringBuilder
        st.reverse();
        System.out.print("Reverse :" + st);

    }
}







