package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

       /* Question 13
        Write a program to print out all Armstrong numbers between
         1 and 500. If sum of cubes of each digit of the number is equal
         to the number itself, then the number is called an Armstrong number.
                For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    */

        int digit1, digit2, digit3, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 to 500");
        int number = input.nextInt();

        digit1 = number/100;
        digit2 = (number%100)/10;
        digit3 = ((number%100)%10)%10;
        result = (digit1*digit1*digit1) + (digit2*digit2*digit2) + (digit3*digit3*digit3);
        if ( number == result ) {
            System.out.println("It is Armstrong Number");
        } else {
            System.out.println("It is NOT Armstrong Number");
        }

        /*while (number > 0) {
            System.out.println( number % 10);
            number = number / 10;        }  */






















    }

}
