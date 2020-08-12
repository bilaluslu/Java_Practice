package day12_Java_Recap;

import java.util.Scanner;

public class Scanner_nextLine_Practice {
    public static void main(String[] args) {

        // 7925 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building number, street, city, state, zipcode

        Scanner input = new Scanner(System.in);

        System.out.println("Building Number:");
        int Bnumber = input.nextInt();

        input.nextLine();       //*** used for taking out "ENTER" ***

        System.out.println("Enter Street:");
        String street = input.nextLine();

        System.out.println("Enter Zipcode:");
        String zipCode = input.next();

        if (zipCode.length() != 4){
            System.out.println("Invalid Entry");
            System.out.println("Try Again, Zipcode must 5 digits");
            zipCode = input.next();
        }

        input.nextLine();       // *** used for taking out "ENTER" ***

        System.out.println("Enter City Name:");
        String cityName = input.nextLine();

        //input.nextLine();       // *** used for taking out "ENTER" ***

        System.out.println("Enter State:");
        String state = input.nextLine();

        String fullAddress = Bnumber + " " + street + ", " + cityName + ", " + state + ", " + zipCode;
        System.out.println("\nYour Address is: " + fullAddress);


















    }
}
