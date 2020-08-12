package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class _155_Fibonacci {
/*
In fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
            1  2  3  4  5  6  7  8   9   10
            0  1  2  3  4  5  6  7   8   9

The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 21
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] arr = new int[num];     //+1
        arr[0] = 0;
        arr[1] = 1;
        for ( int i = 2 ; i < num ; i++ ) { // 2 3 4 5 6       //=
            arr[i] = arr[i-1] + arr[i-2];
            //i2=1         1        0
            //i3=1         1        1
            //i4=2         2        1
            //i5=3         3        2
            //i6=5         5        3
            //i7=8         8        5
            //i8=13        13       8
            //i9=21        21       13
            //i10=34
        }
        System.out.println(arr[num-1]);   // -1
    }


}
