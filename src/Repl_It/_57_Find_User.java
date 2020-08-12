package Repl_It;

import java.util.Scanner;

public class _57_Find_User {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String str = scan.nextLine();

        if ( str.equalsIgnoreCase("Max Payne") || str.equalsIgnoreCase("Alan Wake") ) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }





    }
}
