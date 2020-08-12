package Repl_It;

import java.util.Scanner;

public class atest_Mixed_Case {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String result = "";
        s = s.toUpperCase();

        int j = 1;
        for ( int i = 0 ; i < s.length() ; i=i+2 ) {

            result += s.substring(i,i+1).toLowerCase();
            if ( j < s.length() ) {
                result += s.substring(j, j + 1);
                j = j + 2;
            }
        }
        System.out.println(result);

    }
}
