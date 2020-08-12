package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class atest_Extract_Number {
    /*
    ExtractNum
description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only
example use:
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)
     */

    public static String extractNum(String s) {
        String result = "";
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( s.charAt(i) >= 48 && s.charAt(i) <= 57 ) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(extractNum("a01a2aa3"));
    }



}
