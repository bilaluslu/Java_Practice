package homePractice;


import java.util.Scanner;

public class hp_02_Reverse_Word {
    public static void main(String[] args) {

        /* write a program that can check if the String is plaindrome.
        if it is print true, not print false
        ex: input : level
        output: level (because reversed value is still same)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Word");
        String str = input.nextLine();
        String reverse = "" ;

        for ( int i = str.length()-1 ; i >= 0 ; i-- ) {
            //reverse += str.substring(i, i+1);
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        boolean result = str.equals(reverse) ? true : false ;

        System.out.println(result);
















    }
}