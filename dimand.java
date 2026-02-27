package pattern;

public class dimand {
    public static void main(String[] args) {

        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= (n - row); sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row) - 1; col++) {
                if ((row ==2&&col == 5 ) ) {
                    System.out.print(" ");
                }
                    System.out.print("*");


            }
          System.out.println();
        }
    }

}
