package String;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in); // Scanner class
        StringBuilder str = new StringBuilder();  // class of StringBuilder
        String st = sc.nextLine();   // length of string

        for(int i = 0;i<st.length();i++){
            str.append(st.charAt(i));  // string store in (str object) char by char
        }
        System.out.print(str);   // print string
    }
}
