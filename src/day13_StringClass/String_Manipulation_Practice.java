package day13_StringClass;

import java.util.Scanner;

public class String_Manipulation_Practice {
    public static void main(String[] args) {

      /*  input: cyBerTek sChool
          output: Cybertek School


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();     //cyBerTek sChool

        String firstName = fullName.substring( 0, fullName.indexOf(" ") );
        String lastName = fullName.substring( fullName.indexOf( " ")+1 );

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
*/

/*
write a program that asks the user first and last name, then prints the initals
ex:     input:  cybertek
                school
        output: CS
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        firstName = firstName.substring(0,1).toUpperCase();
        lastName = lastName.substring(0,1).toUpperCase();

        System.out.println("Your full name initial is: " + firstName+lastName);









    }
}
