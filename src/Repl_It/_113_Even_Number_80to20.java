package Repl_It;

import java.util.Arrays;

public class _113_Even_Number_80to20 {
    public static void main(String[] args) {
/*
 Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
 MUST USE FOR EACH LOOP
 */

        int count = 0;
        int[] arr1 = new int[31];
        int k = 0;

        for ( int i = 80 ; i >= 20 ; i=i-2 ) {

            arr1[k]=i;

            k++;

        }

        for ( int each : arr1 ) {

            System.out.print(each + " ");
        }











    }
}
