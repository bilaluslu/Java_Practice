package day19_Arrays;

import java.util.Scanner;

public class warm_Up_Duplicate_Letter {
    public static void main(String[] args) {

/*        write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
*/
        // With using charAt()
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you text:");
        String str = input.nextLine();

        String result = "";     // should be B

        for ( int j = 0 ; j < str.length() ; j++ ) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if ( str.charAt(i) == str.charAt(j) ) {

                    count++;
                }
                }
                if ( count == 1) {

                    result += str.charAt(j) ;
            }


        }System.out.println(result);
*/

// With using substring()

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you text:");
        String str = input.nextLine();

        String result = "";     // should be B

        for ( int j = 0 ; j < str.length() ; j++ ) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.substring(i, i + 1).equals(str.substring(j, +j + 1))) {

                    count++;
                }
            }
            if ( count == 1) {

                result += str.substring(j,+j+1) ;
            }


        }System.out.println(result);















}
}
