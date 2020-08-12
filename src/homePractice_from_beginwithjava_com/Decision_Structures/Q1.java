package homePractice_from_beginwithjava_com.Decision_Structures;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

/*        Question 1
        Even or Odd
        Write a program that asks the user to enter a number and
        displays whether entered number is an odd number or even number.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();

        if ( number % 2 == 0 ) {
            System.out.println("Number is EVEN");
        }
        else {
            System.out.println("Number is ODD");
        }






















    }
}
