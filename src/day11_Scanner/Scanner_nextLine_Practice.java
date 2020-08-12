package day11_Scanner;

import java.util.Scanner;

public class Scanner_nextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();              // 30 + ENTER


        input.nextLine();       // it takes out ENTER from scanner

        System.out.println("Enter you full name:");
        String fullName = input.nextLine();

        System.out.println("Your full name is: " + fullName);
        System.out.println("Your age is: " + age);

























    }
}
