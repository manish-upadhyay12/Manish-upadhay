package FirstPracriceSheet1;

public class ReturnLastSecondDigit {
    public static void main(String[]args){
        int n = 45874;

            int digit = n%100;
            int sum = 0;
            for(int i = digit;i>=1;i/=10) {
                int a =i % 10;
                sum += a;

            }
        System.out.println(sum);
    }
}
