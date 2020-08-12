package day05_Unary_ShorthandOperators;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        /*
        1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
        print true if it's leap year, otherwise print false
        Ex:
        year = 2020  ==> short;
        LeapYear =true/false;
        output:
        2020 is leap year: true     */

        short year = 2025;

        // leapYear: year % 4 == 0
        // if returns true ==> leapYear,  if it returns false ==> not leapYear

        boolean leapYear = year % 4 == 0; //  if the year can be devided by 4 without any reminder, then it's leap year

        //  System.out.println( year + " is leap year: " + leapYear );

        String result =  year + " is leap year: " + leapYear;
        System.out.println(result);


        /*
        Scanner num = new Scanner(System.in);
        System.out.println("enter year:");
        int year = num.nextInt();
        System.out.println("leap year: " + (year%4==0));

        System.out.println();

        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = num.nextInt();
        System.out.println("Number you entered is divisible by 2: " + (a%2==0));
        System.out.println("Number you entered is divisible by 2: " + (a%3==0));
        System.out.println("Number you entered is divisible by 5: " + (a%5==0));
*/
    }

}
