package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class atest_Diving {
    /*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied
by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
     */

    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score for judge 1:");
        double f1 = input.nextFloat();
        System.out.println("Enter score for judge 2:");
        double f2 = input.nextFloat();
        System.out.println("Enter score for judge 3:");
        double f3 = input.nextFloat();
        System.out.println("Enter score for judge 4:");
        double f4 = input.nextFloat();
        System.out.println("Enter score for judge 5:");
        double f5 = input.nextFloat();
        System.out.println("Enter score for judge 6:");
        double f6 = input.nextFloat();
        System.out.println("Enter score for judge 7:");
        double f7 = input.nextFloat();
        System.out.println("Enter difficulty:");
        double diff = input.nextFloat();
        double[] arr = new double[7];
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;
        arr[3] = f4;
        arr[4] = f5;
        arr[5] = f6;
        arr[6] = f7;

        Arrays.sort(arr);

        double sum = arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
        double sum1 = sum*diff;
        double total = sum1*0.6;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
