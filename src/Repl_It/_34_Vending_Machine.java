package Repl_It;

import java.util.Scanner;

public class _34_Vending_Machine {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = input.nextInt();

        if (itemPrice >= 25 && itemPrice <= 100) {
            if (itemPrice % 5 == 0) {
                int remaining = 100 - itemPrice;
                int quarters = remaining/25;
                int dimes = (remaining%25)/10;     //dimes 10 cents
                int nickels = ((remaining%25)%10)/5;     //nickels 5 cents
                System.out.println( "Your change is " + quarters + " quarters, " + dimes + " dimes, and "
                        + nickels + " nickels.");
            }
            else {
                System.out.println("Invalid price!");
            }
        }
        else {
            System.out.println("Invalid price!");
        }






    }
}
