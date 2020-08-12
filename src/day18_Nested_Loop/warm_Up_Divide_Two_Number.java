package day18_Nested_Loop;

public class warm_Up_Divide_Two_Number {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        if ( b == 0 ) {
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }

        int count = 0;  // count the execution of the loop

        while ( a>= b ) {
            a -= b ;
            count++;
        }

        if ( a == 0) {
            System.out.println("The result is: " + count);
        } else {
            System.out.println("The result is: " + count + " with a remainder of " + a);
        }















    }
}
