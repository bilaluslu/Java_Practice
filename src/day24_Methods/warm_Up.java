package day24_Methods;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class warm_Up {
/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator,
	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */
    // Task 1
    public static void Max(int num1, int num2) {

        if ( num1 > num2 ) {
            System.out.println( "Maximum number is: " + num1 );
        } else{
            System.out.println( "Minimum number is: " + num2 );
        }
    }

    //Task 2
    public static void Calculation ( double num1 , double num2 , char operator ) {
        switch (operator) {
            case '+':
                System.out.println("Addition is: " + (num1+num2));
                break;
            case '-':
                System.out.println("Substraction is: " + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplaction is: " + (num1*num2));
                break;
            case '/':
                System.out.println("Division is: " + (num1/num2));
                break;
            case '%':
                System.out.println("Substraction is: " + (num1%num2));
                break;
            default:
                System.out.println("Invalid");
        }

    }

    //Task 3
    public static void palindrome(String str) {

        String reversed = "";
        for ( int i = str.length()-1 ; i >= 0 ; i-- ) {
        reversed += str.charAt(i);
        }
        System.out.println( str.equalsIgnoreCase(reversed) );

    }






    public static void main(String[] args) {
        //Task 1
        int num1 = 100;
        int num2 = 200;
        Max(num1,num2);

        //Task 3
        palindrome("anna");

        //Task 2
        while ( true ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter num1");
            int n1 = input.nextInt();
            System.out.println("Enter num2");
            int n2 = input.nextInt();
            System.out.println("Enter operator");
            char operator = input.next().charAt(0);
            Calculation(n1,n2,operator);
            System.out.println("Do you wanna continue");
            String answer = input.next();

            while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you wanna continue");
                answer = input.next();
            }

            if(answer.equalsIgnoreCase("No")){
                break;
            }
        }


        //Task 3


    }

















}
