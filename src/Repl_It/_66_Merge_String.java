package Repl_It;

import java.util.Scanner;

public class _66_Merge_String {
    public static void main(String[] args) {
/*
        You have 2 words, both of them have 3 characters.
                If either of them does not have exactly 3 characters, print "cannot merge"
        Merge their characters one by one and print together like below:
ear
pie
epaire   */

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if (word1.length()==3 && word2.length()==3) {

            String result = word1.substring(0,1) + word2.substring(0,1)
                            +word1.substring(1,2) + word2.substring(1,2)
                            +word1.substring(2,3) + word2.substring(2,3);
            System.out.println(result);


        } else {
            System.out.println("cannot merge");
        }











    }
}
