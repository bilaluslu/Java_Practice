package Repl_It;

import java.util.Scanner;

public class convert_Binary_To_Decimal {
/*
Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value
and print out to console. Feel free to use additional arrays or formulas.
Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3
binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] binary = new int[8];

        int result = 0;
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.

        int k = binary.length-1;
        for ( int j = 0 ; j < binary.length ; j++ ) {

            result += ( binary[j] * Math.pow(2,k) );

            k--;
        }
        System.out.println(result);










    }
}
