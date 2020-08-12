package Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class _106_Split {
    public static void main(String[] args) {
/*
Given a String variable sentence, write code to type each word in separate lines.
Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String[] str = sentence.split(" ") ;

        for ( int i = 0 ; i <= str.length-1 ; i++ ) {

           reversed += str[i] + "\n ";

            reversed = reversed.substring( 0 , reversed.length()-1 ) ;

        }
        System.out.println(reversed);


    }
}
