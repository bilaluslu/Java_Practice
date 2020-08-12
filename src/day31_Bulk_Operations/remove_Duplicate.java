package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_Duplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,3,3,3,5) );
            // expected result is 1,2,3

        ArrayList<Integer> result = new ArrayList<>();

        for ( Integer each : list) {
            if ( ! result.contains( each ) ) {
                result.add( each );
            }
        }
        System.out.println( result );

        /*
        write a program that can remove the duplicate from an array of Integer
         */

        Integer[] arr1 = {1,1,2,2,3,3};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for ( int i = 0; i < arr1.length ; i++ ) {
            if ( ! nonDuplicates.contains( arr1[i] ) ) {
                nonDuplicates.add( arr1[i] );
            }
        }
        System.out.println( nonDuplicates );









    }
}
