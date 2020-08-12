package Repl_It;

import java.util.Scanner;

public class _95_Sandwich {
    public static void main(String[] args) {
/*A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread"
in the given string, or return string "nothing" if there are not two pieces of bread.
Example:
input: breadjambread
output: jam
Example:
input: xxbreadjambreadyy
output: jam
Example:
input: xxbreadapple
output: nothing
Example:
input: breadbutterbread
output: butter
*/

 /*       Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int firstBread = str.indexOf("bread");
        int firstBreadIndex = firstBread+5;

        int secondBread = str.lastIndexOf("bread");

        if ( firstBread == secondBread ) {
            System.out.println("nothing");
        } else {
            String result = str.substring(firstBreadIndex, secondBread);
            System.out.println(result);
        }
*/
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.contains("bread")) {
            str = str.substring(str.indexOf("bread") + 5, str.length());
        }
        if (str.contains("bread")) {
            str = str.substring(0, str.indexOf("bread"));
            System.out.println(str);
        }else{
            System.out.println("nothing");
    }
}}
