package homePractice;

import java.util.Arrays;

public class Sort {

    public static void Sort1 (String str) { // input :  "DC501GCCCA098911"
                                            // output : "CD015ACCCG011899"

        String result = "";

        for ( int i = 0 ; i < str.length() ; i++) {
            result += "" + str.charAt(i);
            // i = 0    --< D
            // i = 1   --> DC
            // i = 2  --> DC 5
            // i =3  --> DC 501 GCCCA 098911

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    result += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    result += ",";
                }
            }
        }

            String[] arr = result.split(",");

            // DC 501 GCCCA 098911
            String result2 = "";
            // [DC, 501, GCCCA, 098911]
            for ( String each : arr ) {
                char[] chars = each.toCharArray();
                // [ D,C] [5,0,1] [G,C,C,C,A] [0,9,8,8,1,1]

                Arrays.sort(chars);

                for ( char chars2 : chars) {
                    result2 += "" + chars2;
                }
            }
            System.out.println( result2 );
        }
    public static void main(String[] args) {

        Sort1("DC501GCCCA098911");

    }

}
