package Repl_It;

import java.util.Scanner;

public class _151_Unique_Number {
/*Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for ( int k = 0 ; k < nums.length ; k++ ) {
            int count2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==(nums[k])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(nums[k]);
            }
        }

    }

}
