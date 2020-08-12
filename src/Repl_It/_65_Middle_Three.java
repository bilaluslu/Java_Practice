package Repl_It;

import java.util.Scanner;

public class _65_Middle_Three {
    public static void main(String[] args) {
  /*      You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".      */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

             if (word.length() >= 5) {
             if (word.length() % 2 == 1) {
                    String result = word.substring(word.length() / 2 - 1, word.length() / 2 + 2);
                     System.out.println(result);
             } else {
            System.out.println("Invalid");
             }
          }    else {
                   System.out.println("Invalid");
           }






















    }
}
