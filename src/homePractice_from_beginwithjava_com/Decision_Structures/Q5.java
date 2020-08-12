package homePractice_from_beginwithjava_com.Decision_Structures;

import java.util.Scanner;

public class Q5  {
    public static void main(String[] args) {
        /*Question 5
Positive, negative or zero
Write a program that prompts the user to input a number.
The program should then output the number and a message saying whether
the number is positive, negative, or zero.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();

        if (number==0){
            System.out.println("the number is: zero");
        }
        else if ( number > 0) {
            System.out.println("the number is: positive");
        }
        else {
            System.out.println("the number is: negative");
        }






















    }
}
