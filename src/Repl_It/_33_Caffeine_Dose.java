package Repl_It;

import java.util.Scanner;

public class _33_Caffeine_Dose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int mili = input.nextInt();
        int drinkAmount = 10000/mili;
        System.out.println("It would take about " + drinkAmount
                + " drinks for a lethal overdose." );


    }
}
