package Repl_It;

import java.util.Scanner;

public class _35_Gift_Card {
    public static void main(String[] args) {
      /*  Let's say I've got a 100$ gift card and you want to
        buy something in your online store . Write a program
        that will help me to buy something and display leftover
        balance after purchase. If item is not in the list,
                display message: "Invalid item!". If price is more than 100$,
            display message: "Sorry, not enough funds on your gift card!".
                Hint
        Use if/ else if / else
        CODE EXAMPLE:
        */

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        if ( item.equals("Smartphone") ) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if ( item.equals("Laptop") ) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if ( item.equals("Charger") ) {
            System.out.println("Thank you for your purchase!\n" +
                                "Your current balance is: 85$");
        }else if ( item.equals("USB cable") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 90$");
        } else if ( item.equals("Headphones") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 70$");
        } else if ( item.equals("Pants") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 50$");
        } else if ( item.equals("Hat") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 75$");
        } else if ( item.equals("Socks") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 95$");
        } else if ( item.equals("Blanket") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 40$");
        } else if ( item.equals("Pillow") ) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: 60$");
        } else {
            System.out.println("Invalid item!");
        }
















    }
}
