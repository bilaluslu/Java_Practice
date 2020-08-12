package day20_Arrays_Continue;

import java.util.Arrays;

public class array_Size {
    public static void main(String[] args) {
/*
        int[] arr1 = {1,2,3}; // 0 ~ 2
        //    0 1 2
        //   System.out.println( arr1[100] );  // array's size is fixed

        int[] nums = new int[2];  // {0, 0};     0 ~1

        nums[0] = 10; // {10, 0}
        nums[1] = 20;  //{10, 20}
        //nums[2] = 30;  array's size is fixed

        System.out.println( nums[0] ); // 10
        System.out.println( nums[1] ); // 20
        //    System.out.println(nums[2]);

        nums = new int[3];    //Reset , {0, 0, 0}

        System.out.println(nums[0]);  // 0
        System.out.println(nums[1]); // 0
        System.out.println(nums[2]); // 0
*/

        int[] numArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println( numArray[10] );
        numArray[4] = 35;
        System.out.println( numArray[4]);
        System.out.println(Arrays.toString(numArray));
        numArray[9] = numArray[6] + numArray[13];
        System.out.println(numArray[9]);
        System.out.println(Arrays.toString(numArray));


    }
}
