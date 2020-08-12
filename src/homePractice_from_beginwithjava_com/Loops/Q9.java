package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20

        //Question 9
        //Write a program to calculate HCF (highest common factor) of Two given number.

    }

    public static int commonDivisor(int m, int n) {
        //WRITE YOUR CODE HERE

        int max = 2;
        int check = 0;
        for (int i = 2, j = 2; i <= m && j <= n; i++, j++) {
            if (m % i == 0 && n % j == 0) {
                check = 1;
                if (i > max) {
                    max = i;
                }
            }
        }
        if (check == 1) {
            return max;
        } else {
            return 1;
        }

    }
}

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int result1 = input.nextInt();
        System.out.println("Enter Second Number");
        int result2 = input.nextInt();
        int max = 2;
        int check = 0;
        for (int i = 2, j = 2; i <= result1 && j <= result2; i++, j++) {
            if (result1 % i == 0 && result2 % j == 0) {
                check=1;
                if (i > max) {
                    max = i;
                }
            }
        }
        if (check ==1 ) {
            System.out.println("HCF = " + max);
        } else {
            System.out.println("There is no HCF");
        }
*/

/*      calculation of HCF of THREE given number.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int result1 = input.nextInt();
        System.out.println("Enter Second Number");
        int result2 = input.nextInt();
        System.out.println("Enter Third Number");
        int result3 = input.nextInt();
        int max = 2;
        int check = 0;
        for (int i = 2, j = 2 , k = 2 ; i <= result1 && j <= result2 && k <= result3; i++, j++, k++) {
            if (result1 % i == 0 && result2 % j == 0 && result3 % k == 0 ) {
                check=1;
                if (i > max) {
                    max = i;
                }
            }
        }
        if (check ==1 ) {
            System.out.println("HCF = " + max);
        } else {
            System.out.println("There is no HCF");
        }

*/




