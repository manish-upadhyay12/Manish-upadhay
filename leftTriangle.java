package pattern;

public class leftTriangle {
    public static void main(String[] args){
        int n = 5;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("  +");
            }
            System.out.println();
        }
        for(int row1 = n-1;row1>=1;row1--){
            for(int col=1;col<=row1;col++){
                System.out.print("  +");
            }
            System.out.println();
        }
    }
}
