package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class atest_Swap {
    /*
    In this assignment you will swap a position in an array list with another.
swap gets 3 arguments, an arraylist, a position, and another position to swap with.
for example:
swap(["one","two","three"],0,2)
returns:["three","two","one"]
swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]
     */

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        String x = list.get(pos2);

        list.add(pos2, list.get(pos1));
        list.remove(pos2+1);

        list.add(pos1, x);
        list.remove(pos1+1);

        return list;

    }

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>((Arrays.asList("a","b","c","d","e")));
        System.out.println( swap( list1,1,4 ) );

    }//end main

}
