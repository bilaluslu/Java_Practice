package day33_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class warm_Up_Extract_Chars_3 {
    public static void main(String[] args) {
/*
without using for loop , we will use Lambda expression
 */
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        Character[] ch = new Character[ arr.length ];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            ch[i] = arr[i];
        }
        //System.out.println( Arrays.toString(ch) ); // returns all characters

        ArrayList<Character> letters = new ArrayList<>( Arrays.asList(ch) );   // isLetter()
        letters.removeIf( p -> ! Character.isLetter(p) );
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>( Arrays.asList(ch) );    // isDigit()
        digits.removeIf( p-> ! Character.isDigit(p) );
        System.out.println(digits);

        ArrayList<Character> specialChars = new ArrayList<>( Arrays.asList(ch) );
        specialChars.removeAll( letters );
        specialChars.removeAll( digits );
        System.out.println(specialChars);








    }
}
