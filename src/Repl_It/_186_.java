package Repl_It;

import java.util.ArrayList;
import java.util.Arrays;

public class _186_ {
    /*
    description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only
example use:
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint:
you can use:
 Character.isDigit(ch)
 or conditions
     */

    public static String extractNum(String s) {

        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String result = "";
        //ArrayList<Character> digits = new ArrayList<>();
        for (char each : arr) {
            if (Character.isDigit(each)) {
                result+=each;

            }


        }return result;
    }

        public static void main (String[]args){

            System.out.println(extractNum("aa!124!%$#.10aa"));
        }

}