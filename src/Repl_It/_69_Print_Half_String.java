package Repl_It;

import java.util.Scanner;

public class _69_Print_Half_String {
    public static void main(String[] args) {

     //   Write a program that will print out first half of the word twice.

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int word2 = (word.length() ) /2 ;

        System.out.println( word.substring(0,word2) + word.substring(0,word2) );














    }
}
