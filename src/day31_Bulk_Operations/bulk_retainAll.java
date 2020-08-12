package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_retainAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,4,5) );
        // if we want to keep any object in the arraylist we will use retainAll method

        list.retainAll( Arrays.asList(1,2,3) );
            // our output is gonna be 1,2,3,1,2
        System.out.println( list );










    }
}
