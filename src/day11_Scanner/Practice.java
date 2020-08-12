package day11_Scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = input.next();

        System.out.println("Enter Your Last Name");
        String lastName = input.next();

        System.out.println("Are you employed? true or false");
        boolean employed = input.nextBoolean();

        double salary = 0;

        if ( employed == true ) {
            System.out.println("How much your salary?");
            salary = input.nextDouble();
        }


        System.out.println("\nFull Name: " + firstName + " " + lastName);
        System.out.println("Employee Status: " + employed);
        System.out.println("Your Salary Is: $" + salary);








    }
}
