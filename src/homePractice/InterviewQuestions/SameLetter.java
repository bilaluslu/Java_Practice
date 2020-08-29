package homePractice.InterviewQuestions;

import java.util.Arrays;

public class SameLetter {

    public static boolean sameLetter(String a, String b){

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort( ch1 );
        Arrays.sort( ch2 );

        String c1 = "";
        String c2 = "";
        for ( char each : ch1 ) {
            c1 += each;
        }
        for ( char each : ch2 ) {
            c2 += each;
        }

        boolean bool = c1.contains(c2);

        return bool;
    }

    public static void main(String[] args) {
        System.out.println( sameLetter("dasm","adsm") );
    }

}
