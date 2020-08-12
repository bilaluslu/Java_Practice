package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class atest_Two_Times {
    /*
    Create a method that:
is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers
This method should create a new ArrayList of Integers that contains every value of the
ArrayList parameter repeated twice.
For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
     */
    public static void main(String[] args) {

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(2,4,5,6,7));
        twoTimes(list3);

    }
    public static ArrayList<Integer> twoTimes (ArrayList<Integer> list1 ) {

        ArrayList<Integer> list2 = new ArrayList<>();

        for ( int i = 0 ; i < list1.size() ; i++ ) {
            list2.add(list1.get(i));
            list2.add(list1.get(i));
        }
        System.out.println( list2 );
        return list2;
    }







}
