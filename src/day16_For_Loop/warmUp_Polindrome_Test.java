package day16_For_Loop;

import java.util.Scanner;

public class warmUp_Polindrome_Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word =    input.nextLine();   //Java
                                             //0123
        String reversedWord = ""; //avaJ

        int lastIndexNumber = word.length()-1;

        for ( int i = lastIndexNumber ; i >= 0 ; i-- ) {

            reversedWord    +=  word.charAt(i);
            // avaJ
        }
//Level ==> leveL

        boolean palindrome = word.equalsIgnoreCase(reversedWord);

        System.out.println(palindrome);

    }
}
