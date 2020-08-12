package day24_Methods;

import java.util.Arrays;

public class array_Descending {

    public static void main(String[] args) {
        int[] arr1 = { 1 , 10 , 9 , 8 , 14 , 15 };

        int[] arr2 = { 200 , 100 , 150 , 500 , 400};

        int[] arr3 = { 1000 , 800 , 5000 , 3000 };

        arr1 = sortDescending( arr1 );
        System.out.println( "array 1: " + Arrays.toString(arr1) );

        arr2 = sortDescending( arr2 );
        System.out.println( "array 2: " + Arrays.toString(arr2) );

        arr3 = sortDescending( arr3 );
        System.out.println( "array 3: " + Arrays.toString(arr3) );

    }
    public static int[] sortDescending( int[] arr ) {

        Arrays.sort( arr );     // {1,2,3,4} ==> {4,3,2,1}

        int[] revArr = new int[arr.length];

        int j = arr.length-1;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            revArr[i] = arr[j];
            j--;
        }
        return revArr;

    }

}
