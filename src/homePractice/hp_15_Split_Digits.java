package homePractice;

import java.util.Scanner;

public class hp_15_Split_Digits {
    public static void main(String[] args) {

        int digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        digit1 = num/10000;
        digit2 = (num%10000)/1000;
        digit3 = ((num%10000)%1000)/100;
        digit4 = (((num%10000)%1000)%100)/10;
        digit5 = ((((num%10000)%1000)%100)%10)%10;

        System.out.println("Display prompt: " + digit1);
        System.out.println("Display prompt: " + digit2);
        System.out.println("Display prompt: " + digit3);
        System.out.println("Display prompt: " + digit4);
        System.out.println("Display prompt: " + digit5);

    }
}
