package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        //Question 8
        //Write a program that prompts the user to input a positive integer.
        //It should then output a message indicating whether the number is a prime number.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Positive Integer Number");
        int number = input.nextInt();
        int check = 0;
        for ( int i = 2 ; i < number ; i++) {

            if ( number % i == 0 ) {
                check = 1;
                System.out.println("Your number is NOT Prime Number");
                break;

            }

        }
        if (check == 0 ) {
            System.out.println("Prime number");
        }













    }
}
