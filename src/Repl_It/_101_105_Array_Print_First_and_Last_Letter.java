package Repl_It;

import java.util.Scanner;

public class _101_105_Array_Print_First_and_Last_Letter {
    public static void main(String[] args) {
/*Given a String array words, iterate through each word and
print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String result = "";
        System.out.print("[");
        for ( int i = 0 ; i < words.length ; i++ ) {

            result += (words[i].substring(0,1) + words[i].substring(words[i].length()-1) + ", ") ;

        }
        result = result.substring(0,result.length()-2);
        System.out.println(result + "]");


































    }
}
