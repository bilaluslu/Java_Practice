package day18_Nested_Loop;

import java.util.Scanner;

public class nested_Loop_Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("enter 2 number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition is: " + (num1 + num2));
            System.out.println("do you wanna continue?");
            String answer = input.next();

            while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {

                System.out.println("Invalid Entry, please re-entry");
                answer = input.next();

            }
                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using calculator");
                    break;
                }

        }





















    }
}
