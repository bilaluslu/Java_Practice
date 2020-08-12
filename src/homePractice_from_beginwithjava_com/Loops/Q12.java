package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

       /* Question 12
        Write a program to enter the numbers till the user wants
        and at the end the program should display the largest and smallest numbers entered.*/

       Scanner input = new Scanner(System.in);
        System.out.println("If you wanna exit type 'exit' \nEnter number");

        int a = 1 ;
        int  num;
        int max = 0;
        int min = 0;
        String check;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while ( a == 1 ) {
            check = input.next();
            if (check.equalsIgnoreCase("exit")) {
                break;
            } else {
                if ( Integer.parseInt(check) < min ) {
                    min = Integer.parseInt(check);
                }
                if ( Integer.parseInt(check) > max ) {
                    max = Integer.parseInt(check);
                }
            }
        }
        System.out.println("Maximum Number: " + max );
        System.out.println("Minimum Number: " + min );











    }
}
