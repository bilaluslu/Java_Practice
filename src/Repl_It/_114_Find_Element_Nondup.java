package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class _114_Find_Element_Nondup {
    public static void main(String[] args) {

/*
Given an array nums with 7 integers every element is repeated twice -
except one. Find that element and print it to console.
 */
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        Arrays.sort(nums);


        for ( int i = 1 ; i < nums.length ; i++ ) {

            if ( i == 1 && ( nums[i] != nums[i - 1] ) ) {

                System.out.println(nums[i-1]);
                break;
            }
            if(i!= nums.length-1) {
                if ((nums[i + 1] != nums[i]) && (nums[i] != nums[i - 1])) {

                    System.out.println(nums[i]);
                    break;
                }
            }
            else{
                if (nums[i] != nums[i - 1]) {

                    System.out.println(nums[i]);
                }
            }
        }



    }
}
