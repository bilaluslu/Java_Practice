package Repl_It;

public class _162_3_Locks {
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
https://en.wikipedia.org/wiki/Truth_table
 */
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        if ( ( a && b ) || c ) {
            return true;
        } else {
            return false;
        }
   }   //end threeLocks

    public static void main(String[] args) {
        boolean x = threeLocks(false , true ,true);
        System.out.println(x);
    }



}
