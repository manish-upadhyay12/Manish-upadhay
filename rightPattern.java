package pattern;
public class rightPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) { // define no of rows
         for(int sp =1;sp<=n-row;sp++){ // print space
             System.out.print(" ");
         }
            for (int col = 1; col <=row; col++) { // define column how many star you want to print
                System.out.print("*");
            }
            System.out.println(); /// after print one line go to next line

        }
    }
}
