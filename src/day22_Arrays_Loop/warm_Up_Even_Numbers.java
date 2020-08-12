package day22_Arrays_Loop;

import java.util.Arrays;

public class warm_Up_Even_Numbers {
    public static void main(String[] args) {
/*
Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to pint out all the even numbers.
                MUst use continue statement
 */
        // 1
        int[] numbers = new int[100];       // index 0~99

        // 2
        for ( int i = 0 ; i < 100 ; i++ ) {
            numbers[i] = i+1 ;
        }
        System.out.println( Arrays.toString(numbers) );

        // 3

        for ( int each : numbers ) {
            if (each % 2 != 0) {
                continue;

            }
            System.out.print(each + " ");
        }


















    }
}
