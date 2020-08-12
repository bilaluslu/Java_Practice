package homePractice;

import java.util.Scanner;

public class hp_20_Unique_Char {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Word/Sentence");
        String str = input.nextLine();
        String Unique = "";

        for ( int j = 0 ; j < str.length() ; j++ ) {
            int count = 0;

            for (int i = 0 ; i < str.length() ; i++ )

                if ( str.substring(i,i+1).equals("" + str.charAt(j))) {
                    count++;
                }
            if ( count ==1 ) {
                Unique+= "" + str.charAt(j) ;
            }
        }

        System.out.println("\nUnique characters are: " + Unique);
















    }
}
