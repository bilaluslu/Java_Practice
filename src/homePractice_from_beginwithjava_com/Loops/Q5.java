package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        //Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to
        // the power of another. (Do not use Java built-in method) num1^num2
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();
        int result = 1;
        for ( int i = 0 ; i < num2 ; i++ ) {
            result *= num1 ;
        }
        System.out.println(result);
*/
        Scanner input = new Scanner(System.in);
        System.out.println("num1");
        int num1 = input.nextInt();
        System.out.println("num2");
        int num2 = input.nextInt();

        int result = 1;
        for ( int i = 0 ; i < num2 ; i++ ) {
            //          0 1 2 3 4
            result *= num1;
           //  1
           //           1    *  3           1
           //  3        3    *   3          2
           //  9        9    *   3          3
           //  27       27   *  3           4
           //  81
        }
        System.out.println(result);













    }
}
