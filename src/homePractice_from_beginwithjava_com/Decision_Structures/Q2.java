package homePractice_from_beginwithjava_com.Decision_Structures;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

/*Question 2
Absolute value
Write a program that asks the user to enter a number
and displays the absolute value of that number.
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        if ( number < 0) {
            System.out.println("absulate number is: " + (number*-1));
        }
        else if ( number >= 0 ) {
            System.out.println("absulate number is: " + number);
        }








    }
}
