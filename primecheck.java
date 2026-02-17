package Loops;

public class primecheck {
    public static void main(String[] args){
        int n = 11;
        int count =0;
        if( n<=1){
            System.out.println(" not prime");
            return;
        }
        for(int i =2;i<n;i++) {
            if (n % i == 0) {
                count++;
            } else {
                continue;
            }
        }
            if(count<=2){
                System.out.print("prime");
            }
            else{
                System.out.println("not prime");
            }


    }
}
