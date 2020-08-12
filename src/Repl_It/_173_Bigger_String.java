package Repl_It;

public class _173_Bigger_String {
    /*
    the method gets two strings and return the longest one
biggerS("apple","orange") ==> "orange"
     */

    public static String biggerS(String a ,String b) {
        if ( a.length() > b.length() ){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        String x = biggerS("apple","orange");
        System.out.println( x );
    }




}
