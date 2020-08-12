package day22_Arrays_Loop;

import java.util.Arrays;

public class warm_Up_Reverse_Array {
    public static void main(String[] args) {
/*
write a program that can reverse the array
 */
        int[] arr = { 1 , 2 , 3 , 4 , 5 };

        for ( int i = arr.length-1 ; i >= 0 ; i-- ) {

            int eachNum = arr[i];

            System.out.print( eachNum + " ");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int[] revArr = new int[arr.length];

        int j = arr.length-1;
        for ( int i = 0 ; i < arr.length ; i++ ) {

            revArr[ i ] = arr[ j ];     // or we can use revArr[ i ] = arr[ (arr.length-1) - i ];
            j--;
        }
        System.out.println( Arrays.toString(revArr) );

































    }
}
