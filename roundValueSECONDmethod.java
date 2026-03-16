package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class roundValueSECONDmethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 8, 9, 1};
        int k = sc.nextInt();
        for (int j = 1; j <= k; j++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[(i-1)];
            }
            arr[0] = last;


        }
        System.out.print(Arrays.toString(arr));
    }
}
