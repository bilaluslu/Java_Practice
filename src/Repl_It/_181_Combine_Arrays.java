package Repl_It;

import java.util.ArrayList;

public class _181_Combine_Arrays {
    /*
    combine two String arrays into one arraylist and return it as a string.
for example:
combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"
combineRs(["1","2","3"],[" 4"])
returns "1234"
     */

    public static String combineRs(String[] r1,String[] r2)
    {


        ArrayList<String> list = new ArrayList<>();
        for ( int i = 0 ; i < r1.length ; i++ ) {

            list.add( r1[i] );
        }
        for ( int i = 0 ; i < r2.length ; i++ ) {

            list.add( r2[i] );
        }
        //System.out.println( list );

        String str = "";
        for ( int i = 0 ; i < r1.length+r2.length ; i++ ) {

            str += list.get(i);

        }
        return str;

    }

    public static void main(String[] args) {
        String[] r1 = {"a","b"};
        String[] r2 = {"c"};
        System.out.println(  combineRs(r1,r2)  );
    }

}
