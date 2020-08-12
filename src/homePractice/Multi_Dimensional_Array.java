package homePractice;

import java.util.Arrays;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        /*
        n dimensional array contains (n-1) dimensional array
         */

        int[] arr1D = {1,2,3};     // 1D array

        //  2 dimensional array : array that contains 1 dimensional array

        int[][] arr2D = { {1,2,3} , {4,5,6} };

        String[] arr1d = { "A" , "B" };     // 1d string array

                    //         0     1        0     1     2     3
        String[][] arr2d = { {"A" , "B" } , {"C" , "D" , "e" , "f"} };  // 2d string array
                        //        0              1
             // [represents the index number of 1 dimensional arrays] [represents the index number of values]

        System.out.println( arr2d[0][1]);  // to print A
        System.out.println( arr2d[1][2]);  // to print e

        System.out.println(Arrays.deepToString( arr2d ));   // to print all array elements














    }
}
