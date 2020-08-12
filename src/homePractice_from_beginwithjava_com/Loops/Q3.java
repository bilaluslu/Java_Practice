package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        /*Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
        and ask for continue?*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Positive Integer");
        int positive = input.nextInt();

        for ( int i = 1 ; i <= 10 ; i++ )
        if ( positive > 0 ) {
            System.out.println( positive + " * " + i + " = " + (positive*i));
        } else {
            System.out.println("Invalid Entry");
        }
















    }
}
