package homePractice.InterviewQuestions;

import java.util.Arrays;

public class SortLettersAndNumbersFromString {

    public static void SortLettersAndNumbersFromString(String str) {

        String str2 = "";
        for(int i = 0; i < str.length(); i++) { // DC501GCCCA098911
            str2 += ""+str.charAt(i);   // i = 0 ==> D
                                        // i = 1 ==> DC
                                        // i = 2 ==> DC,5
                                        // i = 3 ==> DC,50
                                        // i = 4 ==> DC,501
                                        // i = 5 ==> DC,501,G
                                        // i = 6 ==> DC,501,GC
                                        // i = 7 ==> DC,501,GCC
                                        // i = 8 ==> DC,501,GCCC
                                        // i = 9 ==> DC,501,GCCCA
                                        // i = 10 ==> DC,501,GCCCA,0
                                        // i = 11 ==> DC,501,GCCCA,09
                                        // i = 11 ==> DC,501,GCCCA,098
                                        // i = 11 ==> DC,501,GCCCA,0989
                                        // i = 11 ==> DC,501,GCCCA,09891
                                        // i = 11 ==> DC,501,GCCCA,098911
            if( str.charAt(i) >= 65 && str.charAt(i) <= 90 && i < str.length()-1 ) {
                if( str.charAt(i+1) >= 48 && str.charAt(i+1) <= 57 ) {
                    str2 +=","; // after DC it puts comma
                                // after DC,501,GCCCA  it puts comma
                }
            }
            if( str.charAt(i) >= 48 && str.charAt(i) <= 57 && i < str.length()-1) {
                if(  str.charAt(i+1) >= 65 && str.charAt(i+1) <= 90  ) {
                    str2 +=","; // after DC,501 it puts comma
                }
            }
        }
        String[] arr = str2.split(",");
                // [DC, 501, GCCCA, 098911]
        String str3 ="";
        //for( String each: arr ) {
            for ( int i = 0 ; i < arr.length; i++){
            char[] chars=arr[i].toCharArray();
            // 1 - [D, C]
            // 2 - [5, 0, 1]
            // 3 - [G, C, C, C, A]
            // 4 - [0, 9, 8, 9, 1, 1]
            Arrays.sort(chars);
            // 1 - [C, D]
            // 2 - [0, 1, 5]
            // 3 - [A, C, C, C, G]
            // 4 - [0, 1, 1, 8, 9, 9]
            //for(char eachChar: chars){
                for ( int j = 0 ; j < chars.length ; j++) {
                str3 +=""+chars[j];
            }
        }
        System.out.println(str3);
    }

    public static void main(String[] args) {
        SortLettersAndNumbersFromString("DC501GCCCA098911");
    }
}
