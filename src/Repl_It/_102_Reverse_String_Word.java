package Repl_It;

import java.util.Arrays;

public class _102_Reverse_String_Word {
    public static void main(String[] args) {
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */

        String sentence = "Java is fun";

        String[] str = sentence.split(" ");

        for ( int i = str.length-1 ; i >= 0 ; i-- ) {

            String arr = str[i];

            System.out.println( arr );
        }

















    }
}
