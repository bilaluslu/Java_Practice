package day11_Scanner;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("enter long number");
        long a =input.nextLong();
        System.out.println("you entered " + a);

        System.out.println("enter decimal number");
        float b =input.nextFloat();
        System.out.println("you entered " + b);

        System.out.println("enter decimal number");
        double c =input.nextDouble();
        System.out.println("you entered " + c);

        System.out.println("Enter true or false");
        boolean d = input.nextBoolean();
        System.out.println(d);

// next(); ==> returns the user input as String BUT ONLY FIRST WORD

       // "TODAY IS GREAT DAY"  ==> OUTPUT IS "TODAY"

        System.out.println("Enter Your Sentence");
        String e = input.next();
        System.out.println("Your First Word Is: " + e);

        System.out.println("Enter Your Sentence");
        String f = input.nextLine();
        System.out.println("Your Entered: " + f);














    }
}
