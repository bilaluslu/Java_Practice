package day25_Methods_Recap;

import Resources.Library;

public class frequency_Of_Character {
    public static void main(String[] args) {
        String str = "AABBCC";

        String nonDup = Library.RemoveDuplicates(str);
        String result = "";

        for ( int i = 0 ; i < nonDup.length() ; i++ ) {
            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str,ch);
            result += ch+num;
        }
        System.out.println(result);
    }

    public static String FrequencyOfChars ( String str ) {
        String nonDup = Library.RemoveDuplicates(str);
        String result = "";     // contains the frequency of chars

        for ( int i = 0 ; i < nonDup.length() ; i++ ) {
            String ch = "" + nonDup.charAt(i);  // used "" because to convert char to String
            int num = Library.Frequency(str,ch);
            result += ch+num;
        }
        return  result;
    }





}
