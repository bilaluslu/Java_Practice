package Repl_It;

import java.util.Scanner;

public class _97_Equals_Java_Python {
    public static void main(String[] args) {
/*
Given a string, print out true if the number of appearances of "java"
anywhere in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true
Example:
input: What's the difference between java, javascript and python?
output: false
 */
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int count1 = 0;
        int count2 = 0;
        while (sentence.contains("java") ) {
            count1++;
            sentence = sentence.replaceFirst("java", "");

        }
        //System.out.println(count1);
        while ( sentence.contains("python") ) {
            count2++;
            sentence = sentence.replaceFirst("python", "");
        }
        //System.out.println(count2);

        if ( count1 == count2 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }





    }
}
