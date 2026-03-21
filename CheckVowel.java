package String;
 //  ctrl + alt+ l
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder st = new StringBuilder();   // class StringBuilder
        System.out.print("Entrer string : ");
        String str = sc.nextLine(); // length of string

        int count = 0;  // count to check how many vowel is there

        for (int i = 0; i < str.length(); i++) {
            st.append(str.charAt(i));  //  store string in st object
            char ch = str.charAt(i);    // all charcter store in ch

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {  // check vowel
                count++;  // if vowel find then count increase

            }
        }
        System.out.print(count);  //  print how many vowel in string
    }
}
