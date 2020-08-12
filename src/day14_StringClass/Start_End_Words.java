package day14_StringClass;

import java.util.Scanner;

public class Start_End_Words {
    public static void main(String[] args) {
        /*      Write a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of first word and first
        letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"             */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = input.next();

        System.out.println("Enter your second word");
        String word2 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();

        if ( length1 == 5 && length2 == 5 ) {

            if ( word2.charAt(0) == word1.charAt(length1-1) ) {

                System.out.println("Fizz");

            } else
                System.out.println("Buzz - did not match");

        } else {
            System.out.println("need to be exactly 5 chars length");
        }









    }
}
