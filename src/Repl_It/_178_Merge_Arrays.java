package Repl_It;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _178_Merge_Arrays {
    /*
    mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
     */

    public static int[] mergR(int[] a, int[] b) {
        int z = 0;
        int x = a.length;
        int y = b.length;

        int[] arr3 = new int[x+y];


        for ( int i = 0 ; i < x ; i++ ) {
            arr3[z] = a[i];
            z++;
        }
        for ( int i = 0 ; i < y ; i++ ) {
            arr3[x+i] = b[i];
        }

        return arr3;
    }

    //end mergR

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};
        //mergR(a,b);
        System.out.println(Arrays.toString(mergR(a,b)));

    }




}
