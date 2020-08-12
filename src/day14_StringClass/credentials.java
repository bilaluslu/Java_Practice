package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {

         /*
        userName: cybertek
        passWord: cybertekschool
         */
         String validUserName = "cybertek";
         String validPassWord = "cybertekschool";

         Scanner input = new Scanner(System.in);
         System.out.println("Enter your user name");
         String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputPassWord = input.next();

        if ( inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord) ) {
            System.out.println("Log in succesfully");
        } else {
            System.out.println("Invalid username/password");
        }




















    }
}
