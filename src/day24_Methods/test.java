package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class test {
    public static void main(String[] args) {

        String str = "Cybertek1";
        String revStr = Library.reverse( str );
        System.out.println( revStr);

        int[] arr = { 100 ,200 ,150, 25 , 63};
        int[] descending = Library.sortDescending(arr);
        System.out.println(Arrays.toString(descending));

    }


    // remove duplicates from string

    // Frequency of string

    // merge two array and return third one

    // max number from array

    // min number from array


}
