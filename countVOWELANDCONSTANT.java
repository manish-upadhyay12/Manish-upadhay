package Loops;
import java.util.*;
public class countVOWELANDCONSTANT {
  public  static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char  ch = sc.next().charAt(0);
        if(ch<0){
            return;

        }
        char lower = Character.toLowerCase(ch);
    //    for(int i = ch;i<='z';i++) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }
            else {
          //continue;
      }
            System.out.println("vowel is"+count);
    }
}
