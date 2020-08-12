package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Class_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Enter number 3");
        int num3 = input.nextInt();

        if ( num1 > num2 && num1 > num3) {
            System.out.println("Max number is number 1 = " + num1);
        }
        else if ( num2 > num1 && num2 > num3) {
            System.out.println("Max number is number 2 = " + num2);
        }
        else {
            System.out.println("Max number is number 3 " + num3);
        }


    }
}
