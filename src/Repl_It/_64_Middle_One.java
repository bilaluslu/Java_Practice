package Repl_It;

import java.util.Scanner;

public class _64_Middle_One {
    public static void main(String[] args) {

  /*      You have a word, do the following:

        1. When word has odd number of characters and:
        - 3 or more characters, print middle letter
        oak ==> a
        javav ==> v
                - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
*/
        Scanner input = new Scanner(System.in);
        String word = input.next();

        if ( word.length() % 2 == 1 && word.length() >= 3 ) {
            System.out.println(word.charAt(word.length() / 2));
        }

        if ( word.length() == 1 ) {
            System.out.println( word + word + word);
        }

  /*
        2. When word has even number of characters and:
        - 4 or more characters, print middle 2
        java ==> av
        apples ==> pl
     #$%^&* ==> %^
        - 2 characters, print those 2 characters twice
        @@ ==>@@@@
        $$ ==>$$$$
        hi ==> hihi         */


        if ( word.length() % 2 == 0 && word.length() >= 4 ) {

            int word2 = (word.length() ) /2 ;

            System.out.println( word.substring(word2-1, word2+1) );

        }


        if ( word.length() == 2 ) {
            System.out.println( word + word);
        }

















    }
}
