package Repl_It;

import java.util.Scanner;

public class _73_Email_2 {
    public static void main(String[] args) {

//Write a program that will print out information about the user based on email.
// Print first and last name from the email with the upper case.
// (Assume that first and last names were separated by an underscore)
/*        Example:
        Input: craig_federighi@apple.com
               0123456789012345678901234
        Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
        Top-Level Domain: com       */

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //String firstName = fullName.substring( 0, fullName.indexOf(" ") );
        //firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        if ( email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            firstName = firstName.substring(0, 1).toUpperCase() +
                    firstName.substring(1).toLowerCase();

            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            lastName = lastName.substring(lastName.indexOf("_") + 1, lastName.indexOf("_") + 2).toUpperCase() +
                    lastName.substring(lastName.indexOf("_") + 2).toLowerCase();

            String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

            String level = email.substring(email.indexOf(".") + 1);

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + domain);
            System.out.println("Top-Level Domain: " + level);
        }













    }
}
