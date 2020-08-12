package day26_Method_Overloading;

public class method_Overloading_3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum (15,20);

        sum(10.5,20);

    }

    public static void sum ( int a , int b ) {
        System.out.println(a+b);
    }
    public static double sum ( double a , double b ) {
        return a+b;
    }
}
