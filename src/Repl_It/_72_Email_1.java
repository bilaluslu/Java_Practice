package Repl_It;

import java.util.Scanner;

public class _72_Email_1 {
    public static void main(String[] args) {

        /*        In this task, you need to swap the first name with the last name in the email.
 If the email doesn't contain underscore - do not do anything.
 Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if ( email.contains("_")) {

            String firstName = email.substring(0, email.indexOf("_"));

            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            String rest = email.substring(email.indexOf("@") + 1);

            System.out.println(lastName + "_" + firstName + rest);

        } else {
            System.out.println(email);
        }


























    }
}
