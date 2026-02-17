package TypingCasting;

public class Lec1 {
    public static void main(String[] args) {


		System.out.print("Enter your float number that you want to change in another data type: ");
		         float floatNumber = 2.5f;

		         int intNumber = (int)floatNumber;

		         System.out.print(intNumber);

        long longNUMBER = 12;

        int intNUMBER = (int) longNUMBER;
                       // this is narrowing casting
        System.out.println(intNUMBER);

        int intNUMBEREa = 12;
                       // widening casting

        System.out.println("LONG NUMBER IS " + (long) intNUMBEREa);

        String string = "manish";

        boolean si = Boolean.parseBoolean(string);

        System.out.println(si);

        String n = "123";

        int y = Integer.parseInt(n);

        System.out.println(y);
    }
}