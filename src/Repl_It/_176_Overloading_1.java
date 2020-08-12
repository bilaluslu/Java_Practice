package Repl_It;

import javax.swing.*;

public class _176_Overloading_1 {
    /*
    In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
    First method should work with array of integers (int[]) and return int, and second method
    should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
For more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
Comment: Methods should be non static and with a return type.
     */

    public static int findMax(int[] arr1) {

        int max1 = arr1[0]; // 10

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] >= max1) {
                max1 = arr1[i];
            }
        }
        return max1;
    }

        public static double findMax ( double[] arr2 ) {
                double max2 = arr2[0];

                for(int i = 0; i < arr2.length ; i++  ){

                    if(arr2[i] >= max2){
                        max2 = arr2[i];
                    }
        }
            return max2;

    }



}
