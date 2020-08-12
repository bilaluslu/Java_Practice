package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

       /* Question 19
        Write a program to compute sinx for given x.
        The user should supply x and a positive integer n. We compute the sine of x
        using the series and the computation should use all terms in the series up
        through the term involving xn

            sin x = x - x^3/3! + x^5/5! - x^7/7! + x^9/9! ....... +x^n/n!      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        double n = input.nextDouble();
        System.out.println("Enter x:");
        double x = input.nextDouble();
        double sum1 = 0 ;
        double sum2 = 0 ;
        double count1 = 1;
        double count2 = 1;

        for ( double i = 1 ; i <= n ; i = i+4 ) {
            for ( double j = 1 ; j <= i ; j++) {
                count1 = count1 * j;
            }
            System.out.println(count1);
            sum1 += (Math.pow(x,i)/count1);
        }
        System.out.println("sum1 " + sum1);

        for ( double i = 3 ; i <= n-2 ; i = i+4 ) {
            for ( double j = 3 ; j <= i ; j++) {
                count2 = count2 * j;
            }
            System.out.println(count1);
            sum2 -= (Math.pow(x,i)/count2);
        }
        System.out.println("sum2 " + sum2);

        System.out.println(sum1 + sum2);

        //System.out.println(Math.sin(30));


      /*  for ( int i = number ; i >= 1 ; i--) {

            count = count * i;
            */
















    }
}
