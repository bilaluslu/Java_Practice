package day24_Methods;

import java.util.Arrays;

public class return_Method_Practice {
    /*
    create a function that can return the maximum number from any given array
    create a function that can return the minimum number from any given array
     */
    public static void main(String[] args) {
        int[] arr = {9,8,7,100,200,50,40};

        int max = maxNumber( arr );
        System.out.println( "Max number: " + max );

        int min = minNumber( arr );
        System.out.println( "Min number: " + min );

    }

    public static int maxNumber ( int[] arr ) {
        Arrays.sort( arr );

        return arr[ arr.length-1 ];
    }

    public static int minNumber ( int[] arr ) {
        Arrays.sort( arr );

        return arr[ 0 ];
    }


















}
