package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_containsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // if 10 20 60 if all object are exits in arraylist ==> true
        // otherwise ==> false
/*
        // this is longer version
        boolean r1 = list1.contains(10);    // we have
        boolean r2 = list1.contains(20);    // we have
        boolean r3 = list1.contains(60);    // we have
        boolean result = r1 == true&& r2 == true && r3 == true;
        System.out.println( result );       // output is false
*/
        boolean result2 = list1.containsAll(Arrays.asList( 10 , 20 , 30 ) ); // to check every element we
                                        // just pass element in the Arrays.asList( object1, object2 ...... )
        System.out.println(result2);        // returns true

        // 10 ,30, 40
        Integer[] data = {10, 30, 40};

        boolean result3 = list1.containsAll( Arrays.asList( data ) );
        System.out.println( result3 );      // returns true




    }
}
