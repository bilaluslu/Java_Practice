package Repl_It;

import java.util.Arrays;

public class _195_Anagram {

    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.replaceAll(" ","").toLowerCase();
        word2 = word2.replaceAll(" ","").toLowerCase();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2) ) {
            return true;
        } else {
            return false;
        }
/*
        if ( arr1.length != arr2.length){
            return false;
        }
        else {
            int count = 0;
            for ( int i = 0 ; i < arr1.length ; i++ ) {
                if (arr1[i] == arr2[i] ) {
                    count++;
                }
            }
            if ( count == arr1.length) {
                return true;
            } else {
                return false;
            }
        }
*/
    }

    public static void main(String[] args) {

        System.out.println( isAnagram( "silent","listen"));
    }


}
