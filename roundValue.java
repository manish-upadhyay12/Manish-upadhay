package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class roundValue {
    public static  void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int arr[] = { 5,8,9,1};
        int k = sc.nextInt();
        for(int j = 1;j<=k;j++) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }
System.out.print(Arrays.toString(arr));
    }
}
