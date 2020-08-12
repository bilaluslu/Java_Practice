package Repl_It;

import java.util.Scanner;

public class _75_Without_X_x {
    public static void main(String[] args) {

/*        Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
 */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean x = word.startsWith("X") || word.startsWith("x");
        boolean y = word.endsWith("X") || word.endsWith("x");

        if ( x && y ) {
            System.out.println(word.substring(1, word.length()-1));
        }
        else if ( x ) {
            System.out.println(word.substring(1));
        }
        else if ( y ) {
            System.out.println(word.substring(0, word.length()-1));
        }
        else {
            System.out.println(word);
        }

















    }
}
