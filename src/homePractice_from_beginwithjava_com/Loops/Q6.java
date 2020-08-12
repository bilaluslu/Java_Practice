package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

       // Question 6
       // Write a program that prompts the user to input an integer
        // and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321.
/*      digit1 = num/10000;
        digit2 = (num%10000)/1000;
        digit3 = ((num%10000)%1000)/100;
        digit4 = (((num%10000)%1000)%100)/10;
        digit5 = ((((num%10000)%1000)%100)%10)%10;
        System.out.println("Display prompt: " + digit1);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();
            while (number > 0) {
                System.out.print( number % 10);
                number = number / 10;

        }
*/

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        int result = 1;
        //  12345 ==> 54321
        while ( number > 0 ) {

            System.out.print( number % 10 );        // 5 4 3 2 1

            number = number / 10;

        }








    }
}
