package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

      /*  Question 15
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n :");
        double number = input.nextInt();
        double sum = 0 ;

        for ( double i = 1 ; i <= number ; i++) {

            sum += (1/i);

        }
        System.out.println(sum);










    }
}
