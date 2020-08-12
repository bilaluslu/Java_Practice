package Repl_It;

import java.util.Scanner;

public class _67_Reverse_String {
    public static void main(String[] args) {

/*        Write a program that will reverse a string. Your program should reverse
a string only 5 characters long. If word is shorter, display message:
"Too short!". If word is longer, display message: "Too long!". Otherwise,
reverse this word and print out result into the console.
 */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int lastIndexNumber = word.length()-1;


            if (lastIndexNumber < 4 ){
                System.out.println("Too short!");

            } else if (lastIndexNumber > 4 ) {
                System.out.println("Too long!");

            } else if (lastIndexNumber == 4) {
                for (int i = lastIndexNumber; i >= 0; i--) {
                    System.out.print(word.charAt(i));
                }
            }


























/*
        Scanner input = new Scanner (System.in);
        System.out.println ("Split:");
        Boolean split = input.nextBoolean();
        System.out.println ("Number of people:");
        byte people = input.nextByte();
        System.out.println ("Check amount:");
        double amount = input.nextDouble();
        System.out.println ("Service Quality:");
        String service = input.next();
        double totaltip = (service == "poor") ? (amount * 0.05) : (service == "fair") ?
                (amount * 0.10) : (service == "good") ? (amount * 0.15) : (service == "great") ?
                (amount * 0.2) : (amount * 0.25);
        double totalPerPerson = (amount + totaltip) / people;
        if (split){
            double tipPerPerson = amount / person;
        }
        System.out.println ("Number of people entered: " + people);
        System.out.println ("Total to pay: " + amount);
        System.out.println ("Total tip: " + totaltip);
        System.out.println ("Total per person: " + totalPerPerson);
        System.out.println ("Tip per person: " + tipPerPerson);
   */







    }

}









