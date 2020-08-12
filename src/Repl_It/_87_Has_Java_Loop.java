package Repl_It;

import java.util.Scanner;

public class _87_Has_Java_Loop {
    public static void main(String[] args) {
/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
 Example:
input: javapython
output: true
Example:
input: cjavac++
output: true
Example:
input: c#javaruby
output: false
 */
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() < 4) {
            System.out.println(exists);
        } else if (( word.startsWith("Java") || word.substring(1).startsWith("Java") )) {
            System.out.println(!exists);
        } else {
            System.out.println(exists);
        }


























    }
}
