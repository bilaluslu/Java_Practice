package homePractice_from_beginwithjava_com.Decision_Structures;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*Question 4
Largest Number
Write a program that asks the user to enter a numbers in three variables
and then displays the largest number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println("enter third number");
        int num3 = input.nextInt();

        if ( num1 > num2 && num1 > num3 ) {
            System.out.println("Number 1 is the largest");
        }
        else if ( num2 > num1 && num2 > num3 ) {
            System.out.println("Number 2 is the largest");
        }
        else {
            System.out.println("Number 3 is the largest");
        }
















    }
}
