package homePractice.InterviewQuestions;

import java.util.Arrays;

public class SortLettersAndNumbersFromString2 {

    public static void main(String[] args) {


        String str2 = "DC,501,GCCCA,098911";
        String[] arr = str2.split(",");
        // arr { "DC" , "501" , "GCCCA" , "098911" }

        System.out.println( "array split   " + Arrays.toString(arr));
        String str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            //System.out.println( "char a cevirme " + Arrays.toString(chars));

            Arrays.sort(chars);

            System.out.println( "char a cevirme + sort " + Arrays.toString(chars));

            for(char eachChar: chars){

                str +=""+eachChar;

            }
            //System.out.println("str a atma " + str);
        }

        System.out.println(str);
    }
}
