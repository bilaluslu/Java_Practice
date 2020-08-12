package homePractice_from_beginwithjava_com.Methods;

public class Q2 {
/*
Question 2
Write a method named isEven that accepts an int argument. The method should return true
if the argument is even, or false otherwise. Also write a program to test your method.
 */

    public static void main(String[] args) {
        isEven(15);
    }

    public static void isEven (int x) {

        if ( x % 2 == 0 ) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }


}
