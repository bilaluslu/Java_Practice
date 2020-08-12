package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

       /* Question 16
        Compute the natural logarithm of 2, by adding up to n terms in the series
        1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
        where n is a positive integer and input by user.    */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n :");
        double number = input.nextInt();
        double sum1 = 0 ;
        double sum2 = 0 ;

        for ( double i = 1 ; i <= number ; i++) {

            if ( number % 2 == 1 ) {
                sum1 = sum1 + (1 / i);
            }
            if ( number % 2 == 0 ) {
                sum2 = -sum2 - (1 / i);
            }

        }
        System.out.println(sum1+sum2);








    }
}
