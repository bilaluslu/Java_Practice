package day33_Custom_Class;

import java.util.ArrayList;

public class warm_Up_Extract_Chars_2 {
    public static void main(String[] args) {
/*
    with for loop
 */
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();   // isLetter()
        ArrayList<Character> digits = new ArrayList<>();    // isDigit()
        ArrayList<Character> specialChars = new ArrayList<>();

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char each = str.charAt(i);
            if ( Character.isLetter(each) ) {
                letters.add( each );
            } else if ( Character.isDigit(each) ) {
                digits.add( each );
            } else {
                specialChars.add( each );
            }
        }
        System.out.println( letters );
        System.out.println( digits );
        System.out.println( specialChars );

    }
}
