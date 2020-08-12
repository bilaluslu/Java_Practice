package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Class_Salary_Rate_Calculator {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary:");
        int num1 = input.nextInt();
        System.out.println("How many hours do you work in a week?");
        int num2 = input.nextInt();
        System.out.println("How many weeks do you work in a year?");
        int num3 = input.nextInt();

        System.out.println("Your hourly rate is= " + ((num1/num3)/num2));
*/

        Scanner input1 = new Scanner(System.in);
        System.out.println("How much money do you make per hour?");
        int num4 = input1.nextInt();
        System.out.println("How many hours do you work in a week?");
        int num5 = input1.nextInt();
        System.out.println("How many weeks do you work in a year?");
        int num6 = input1.nextInt();

        System.out.println("Your salary is= $" + (num4*num6*num5));




    }
}
