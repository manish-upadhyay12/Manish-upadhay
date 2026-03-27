

//  find  all unique element
package ArrayQuestion;

import java.util.*;

public class FindUniqueValueSorted {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);

        int ar[] = {1, 1, 2, 1, 2, 5, 3, 9, 5, 2};
        ////////////////////////////////////////  we sort array
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int temp = ar[i];
                if (ar[i] > ar[j]) {
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        //  array sort completed

        for (int i = 0; i < ar.length; i++) {
            int count = 0;    // count for check element how many time it come
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;  //  count value
                }
            }
            if (count == 1) {  //  if value is equal to 1 then print  value
                System.out.print(ar[i] + " ");
            }
        }
    }
}

