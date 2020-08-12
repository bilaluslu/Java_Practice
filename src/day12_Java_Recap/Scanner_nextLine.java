package day12_Java_Recap;

import java.util.Scanner;

public class Scanner_nextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     // 13 + ENTER

        System.out.println("Enter number");
        int num = input.nextInt();              // output is 13
        System.out.println(num);

        input.nextLine();       // used for taking out the "ENTER"

        System.out.println("Enter name");
        String name = input.nextLine();


    }
}
