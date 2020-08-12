package Repl_It;

public class _166_Merge_String {
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
    public static String mergeStrings(String one, String two) {
        String a = "";
        if ( one.length() > two.length() ) {

            for (int i = 0; i < two.length(); i++) {

                a += one.substring(i, i + 1) + two.substring(i, i + 1);

            } a += one.substring(two.length());
        } else {
            for (int i = 0; i < one.length(); i++) {

                a += one.substring(i, i + 1) + two.substring(i, i + 1);

            } a += two.substring(one.length());

        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));
    }



}
