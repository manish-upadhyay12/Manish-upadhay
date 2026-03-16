package ArrayQuestion;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i<arr.length;i++){
            System.out.print( "enter element : "+(i+1 ));
            arr[i] = sc.nextInt();
        }
        int nonZero = 0;
        for(int i = 0;i<arr.length;i++){
          int temp = arr[nonZero];
         if(arr[i]!=0){
             arr[nonZero] = arr[i];
             arr[i]  = temp;
             nonZero++;
         }

    }
        System.out.print(Arrays.toString(arr));
    }
}
