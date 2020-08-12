package day21_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class string_Methods {
    public static void main(String[] args) {

        /*   toCharArray() Methods    */

        String name = "Java"; // 'J' ,'a' , 'v' , 'a'

        char[] chars = name.toCharArray();  // 4

        System.out.println(chars[0]);       // J
        System.out.println(chars[2]);       // v


        /*  split(str) Methods  */

        String str = "I love Java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr) );
        // output is ==> [I, love, Java]



        /*  reverse sentence: day great is today  */
        String sentence = "today is great day";
        String[] words = sentence.split(" ");

        System.out.println( Arrays.toString(words) );   // [today, is, great, day]

        for ( int i = words.length-1 ; i >= 0 ; i-- ) {
            String eachWords = words[i];
            System.out.print( eachWords + " ");
        }
        System.out.println();


        String str2 = "ABCD";
        String[] arr2 = str2.split("");
        char[] ch2 = str2.toCharArray();

        System.out.println( Arrays.toString( arr2 ) );    // [A, B, C, D] ==> String
        System.out.println( Arrays.toString( ch2 ) );     // [A, B, C, D] ==> Char





















    }
}
