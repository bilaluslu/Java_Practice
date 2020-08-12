package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }


    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static String RemoveDuplicates(String str){
        String result =  "";      //AB
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }
        }
        return result;
    }


    public static int Frequency ( String str1, String str2) {
        int count = 0;
        while ( str1.contains(str2) ) {
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        return count;
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

    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]
        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str){ // "AABCDCD"
        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }

    // to find a maximum number from ArrayList

    public static int max( ArrayList<Integer> list ) {
        int maximum = Integer.MIN_VALUE;
        for ( int i = 0 ; i < list.size() ; i++ ) {
            if ( list.get(i) > maximum ) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }









}
