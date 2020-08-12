package day14_StringClass;

import java.util.Scanner;

public class credentials_2 {
    public static void main(String[] args) {

        /*
        valid credentials are:
            username: cybertek
            password: cybertekschool

      precondition: username and password co=annot be empty
                    if they are empty ==>  please enter the credentials
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name");
        String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputPassWord = input.next();

        boolean loggedIn = inputUserName.equals("cybertek") && inputPassWord.equals("cybertekschool");
        boolean InvalidUserName = ! inputUserName.equals("cybertek") && inputPassWord.equals("cybertekschool");
        boolean InvalidPassWord = inputUserName.equals("cybertek") && ! inputPassWord.equals("cybertekschool");

        if ( !inputUserName.isEmpty() && !inputPassWord.isEmpty() ) {   //username and password are NOT empty

            if ( loggedIn ) {
                System.out.println("\nLOGGED IN");
            } else if ( InvalidUserName ) {
                System.out.println( "Password is correct, username is NOT correct" );
            } else if ( InvalidPassWord ) {
                System.out.println( "Password is NOT correct, username is correct" );
            } else {
                System.out.println( "Both username and password are incorrect" );
            }



        } else {
            System.out.println("Please Enter The Credentials");
        }









    }
}
