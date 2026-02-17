package conditionalStatement;
import java.util.*;
public class leapyear {
    public static void main(String[]args){
        Scanner sc  =new Scanner(System.in);
        int year =  sc.nextInt();
        if(((year%4==0 )&&( year %100!= 0) || year%400 == 0))
        {
            System.out.println("Given year  "+year +" is aleap year");
    }
        else{
            System.out.println("Given year is  "+year +" not a leap year");
    }


    }
    }







