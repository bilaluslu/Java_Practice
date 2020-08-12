package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

       // Question 10
        //Write a do-while loop that asks the user to enter two numbers.
        // The numbers should be added and the sum displayed.
        // The loop should ask the user whether he or she wishes
        // to perform the operation again. If so, the loop should repeat;
        // otherwise it should terminate.


        int num1 , num2 , num3;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            num1 = input.nextInt();
            System.out.println("Enter second number");
            num2 = input.nextInt();
            System.out.println("Sum of two number is: " + (num1+num2));
            System.out.println("Do you wanna continue? If YES press 1, if NO press 2");
            num3 = input.nextInt();
        }

        while ( num3 == 1 ); {

        }










    }
}
