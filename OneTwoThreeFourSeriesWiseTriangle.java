package pattern;

public class OneTwoThreeFourSeriesWiseTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (i - 1) + 1; j++) {

                System.out.print(" *");


            }
            System.out.println();
        }

    }
}



