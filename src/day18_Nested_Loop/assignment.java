package day18_Nested_Loop;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {

/*  write a program for room reservation
king bed  $120
queen bed  $100
single bed  $80
should ask which bedroom doy ou wanna reserve
if user invalid entry ==> please re enter
calculate total price
do you wanna reserve another room
if yes == > repeat the previous steps
if no ==>  your total price is: $$$

if answer either yes or no ==> please re enter
 */
        Scanner input = new Scanner(System.in);


        String answer =input.nextLine();

        while ( ! (answer.equalsIgnoreCase("king bed") || answer.equalsIgnoreCase("queen bed")) || answer.equalsIgnoreCase("single bed")) {

            System.out.println("Invalid Entry, please re-entry");
            answer = input.next();

        }


    }
}
