package Repl_It;

import java.util.Scanner;

public class _103_Arrays_Reverse_Sentence {
    public static void main(String[] args) {
/*Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] str = sentence.split(" ");

        for ( int i = str.length-1 ; i >= 0 ; i-- ) {

            reversed += str[i] + " ";

        }

        reversed = reversed.substring( 0 , reversed.length()-2 ) ;

        System.out.println(reversed);

    }
}
