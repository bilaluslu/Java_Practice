package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class _190_ {
    /*Create a static method that:
is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
   The original ArrayList should remain unchanged.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,-5,4,5,-3));
        appendPosSum(list2);
    }
    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list1 ) {

        ArrayList<Integer> list2 = new ArrayList<>();

        for ( int i = 0 ; i < list1.size() ; i++ ) {
            if ( list1.get(i) > 0) {
                list2.add(list1.get(i));
            }
        }
        int sum = 0;
        for ( int i = 0 ; i < list2.size() ; i++ ) {
            sum += list2.get(i);
        }
        list2.add( sum );

        System.out.println( list2 );

        return list2;
    }




}
