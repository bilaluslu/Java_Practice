package day16_For_Loop;

import java.util.Scanner;

public class warmUp_Calculate_Sum {
    public static void main(String[] args) {
/*
        write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275
        input : 200
        output : 20100                  */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int sum = 0;

        for ( int i = 1 ; i <= num ; i++) {

            sum = sum + i;      //sum += i;
            // 1     0  + 1
            // 3     1  + 2
            // 6     3  + 3
            // 10    6  + 4
        }
        System.out.println(sum);










    }
}
