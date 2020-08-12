package day17_While_Loops;

import java.util.Scanner;

public class warm_Up_Max_And_Min {
    public static void main(String[] args) {

        /*1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
         */

        Scanner input = new Scanner(System.in);
        int maxNumber = -1999999999;    // any number the user provided will be greater than this number
                                        // first user entered variable will be initalized to MaxNumber
        int minNumber = 2147483647;     // any number the user provided will be smallerer than this number
                                        // first user entered variable will be initalized to MinNumber

        for ( int i = 1 ; i <=5 ; i++) {
            System.out.println("Enter a number " + i);
            int num =input.nextInt();

            if ( num > maxNumber) {     // to compare each user inputs , and assign the maximum number to MaxNumber
                maxNumber = num;
            }
            if ( num < minNumber) {     // to compare each user inputs , and assign the minimum number to MinNumber
                minNumber = num;
            }
        }

        System.out.println("\nMax Number is: " + maxNumber);
        System.out.println("\nMin Number is: " + minNumber);











    }
}
