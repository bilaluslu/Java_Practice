package day15_For_Loop;

import java.util.Scanner;

public class Warm_Up_Initials {
    public static void main(String[] args) {

        /*
1. write a program that asks user's first and last name, then prints out the initials of the user
            Ex:
                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName  =  scan.next();

        System.out.println("Enter your last name");
        String lastName  =  scan.next();


            String initials2 = firstName.substring(0,1).toUpperCase() +  lastName.substring(0,1).toUpperCase();
             //    initials2 = initials.toUpperCase();
        System.out.println("=====================");

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);  // returns string

        initials = initials.toUpperCase();
        System.out.println(initials);












    }
}
