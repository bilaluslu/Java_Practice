package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        //Question 7
        //Write a program that reads a set of integers,
        //and then prints the sum of the even and odd integers.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int count1 = 0;
        int count2 = 0;

        for ( int i = 1 ; i <= Integer.toString(number).length() ; i++) {

            if (i % 2 == 0) {

                count1 = count1 + i;

            } else if (i % 2 == 1) {

                count2 = count2 + i;
            }
        }
            System.out.println("Even Number: " + count1);
            System.out.println("Odd Number: " + count2);







    }
}
