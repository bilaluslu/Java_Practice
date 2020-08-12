package OfficeHours.Practice_03_25_2020;

import java.util.Scanner;

public class Nested_If_Practice_Credit_Score_Calculator {
    public static void main(String[] args) {

        /* for the loan:
        if he/she has a job that pays > $50000 ==> might be eligible
            if he/she has good credit >= 650
                if job history is more than or equal to 2 ==> then eligible
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary");
        int salary = input.nextInt();
        System.out.println("Enter Credit Score");
        int creditScore = input.nextInt();
        System.out.println("How many years did you work?");
        int jobHistory = input.nextInt();

        if ( salary > 50000 ) {  // might be eligible

            if ( creditScore > 650 ) {  //might be eligible

                if ( jobHistory >= 2) {     //eligible for loan

                    System.out.println("  You are qualified \n !!!Congrulations!!!");
                } else {    //not eligible due to job history
                    System.out.println("You do not have enough job history, come back later");
                }

            } else {    // not eligible due to credit score
                System.out.println("You do not have good credit score");
            }

        } else {
            System.out.println("You need have a job that pays $50000");
        }







    }
}
