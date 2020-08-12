package Repl_It;

import java.util.Scanner;

public class _99_Count_Triples {
    public static void main(String[] args) {
/*We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.
Example:
input: abcXXXabc
output: 1
Example:
input: xxxabyyyycd
output: 3
Example:
input: java
output: 0
   */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

        for ( int i = 1 ; i < str.length()-1 ; i++ ) {

        if ( str.charAt(i-1) == str.charAt(i) && str.charAt(i) == str.charAt(i+1) ) {

                count++;
            }
        }
        System.out.println(count);


    }
}
