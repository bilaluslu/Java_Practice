package homePractice_from_beginwithjava_com.Decision_Structures;

import day11_Scanner.Scanner_Class;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        /*Question 3
Discount and Revenue
Revenue can be calculated as the selling price of the product times the quantity sold,
 i.e. revenue = price × quantity. Write a program that asks the user to
 enter product price and quantity and then calculate the revenue.
 If the revenue is more than 5000 a discount is 10% offered.
 Program should display the discount and net revenue.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Price:");
        double price = input.nextDouble();
        System.out.println("Enter Quantity");
        int quantity = input.nextInt();
        double revenue = price*quantity;

        if (revenue < 5000) {
            System.out.println("Net revenue is: " + revenue);
        }
        else if ( revenue >= 5000) {
            System.out.println("Discount is: " + (revenue*0.1));
            System.out.println("Net revenue is: " + (revenue*0.9));
        }































    }
}
