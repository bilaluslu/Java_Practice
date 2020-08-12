package Repl_It;

import java.util.Scanner;

public class _143_Pattern {
/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
*****
*   *
*   *
*   *
*****
hint:you will need to use two nested for loops for that, and an if that checks if its the last
or first iteration of the loop (so you will know when to print "*" or " ")
 */


    public static void printHollowRect(){
        // write your code here:

        System.out.print("*****");
        System.out.println();
        for ( int i = 0 ; i < 3 ; i++ ) {

            for (int j = 0 ; j < 1; j++) {

                System.out.print("*   *");

            }
            System.out.println();
        }
        System.out.print("*****");




    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }

}
