package homePractice;

import java.util.Scanner;

public class hp_18_Basic_Calculator_Loop {
    public static void main(String[] args) {
        /*create a function that takes two numbers and a mathematical
            operator + - / * and will perform a calculation with the given numbers.
        calculator(2, '+', 2) ➞ 4
        calculator(2, '*', 2) ➞ 4
        calculator(4, '/', 2) ➞ 2
*/
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number 1:");
            double num1 = input.nextDouble();
            System.out.println("Enter Number 2:");
            double num2 = input.nextDouble();

            System.out.println(" Press 1 for: *\n Press 2 for: /\n Press 3 for: +\n Press 4 for: -\n Press 5 for: %");

            double a = input.nextFloat();



            if (a == 1) {
                System.out.println("Your Result is: " + (num1 * num2));

            } else if (a == 2 && num2 != 0) {
                System.out.println("Your Result is: " + (num1 / num2));

            } else if (a == 3) {
                System.out.println("Your Result is: " + (num1 + num2));

            } else if (a == 4) {
                System.out.println("Your Result is: " + (num1 - num2));

            } else if (a == 5) {
                System.out.println("Your Result is: " + (num1 % num2));
            }

            System.out.println("Do you wanna continue?");
            String answer = input.next();
                while (!(answer.equals("yes") || answer.equals("no")) ) {
                    System.out.println("Invalid entry please re enter");
                    System.out.println("Do you wanna continue?");
                    answer = input.next();
                }
                if (answer.equals("no")) {
                    break;
                }
            }

/*
        float b = (float) a;

        switch ((int) b) {
            case 1:
                System.out.println("Your Result is: " + (num1 * num2));
                break;
            case 2:
                System.out.println("Your Result is: " + (num1/num2));
                break;
            case 3:
                System.out.println("Your Result is: " + (num1+num2));
                break;
            case 4:
                System.out.println("Your Result is: " + (num1-num2));
            default:
                System.out.println("Your Result is: INVALID");
        }
*/








    }
}
