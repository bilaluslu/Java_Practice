package day22_Arrays_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class warm_Up_Cut_Words {
    public static void main(String[] args) {
/*1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
     to get this ==> we will use Arrays, scanner, for loop , for each, substring
 */

        String arr[] = new String[5];

        for ( int i = 0 ; i < arr.length ; i++ ) {
            Scanner scan = new Scanner(System.in);
            arr[i] = scan.nextLine();
        }
        System.out.println( Arrays.toString(arr) );

        for ( String each : arr ) {

            String str = each.substring( 0 , 3 );

            System.out.println( str );
        }































    }
}
