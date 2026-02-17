package pattern;

public class LeftRightmix {
    public static void main(String[] args) {
        int n = 5;
        for(int row = n; row>=1; row--) {
            for(int sp =n-row; sp>=1; sp--) {
                System.out.print("  ");
            }

            for(int col =1; col<=row; col++) {
                System.out.print("*" );
            }
            System.out.println();
        }
        for(int row = 1; row<=n; row++) {
            for(int sp =1; sp<=n-row; sp++) {
                System.out.print("  ");
            }

            for(int col =1; col<=row; col++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}
