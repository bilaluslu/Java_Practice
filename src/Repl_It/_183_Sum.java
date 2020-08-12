package Repl_It;

import java.util.ArrayList;

public class _183_Sum {
    /*
    The method .get(i) will return the element found at index i.  The following two expressions also do the same thing:
someList.get(4)
arr[4]
On the left, given an ArrayList of Integers called ints, find and return the sum of all the Integers in ints.
     */
    public static int sum(ArrayList<Integer> ints) {
        //write code here
        int sum = 0;
        for ( int i =0 ; i < ints.size() ; i++ ) {
            sum += ints.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
