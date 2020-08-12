package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class _115_Finding_Max_Length_String {
    public static void main(String[] args) {
/*Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
*/
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }
        int index = 0;
        int wordLength;
        wordLength = words[0].length();

        for ( int i = 0 ; i < words.length ; i++ ) {

            if (words[i].length() > wordLength) {

                wordLength = words[i].length();
                index = i;
            }
        }
        System.out.println( words[index]);































    }
}
