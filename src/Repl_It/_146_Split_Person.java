package Repl_It;

import java.util.Scanner;

public class _146_Split_Person {
/*
The method person get a string with this format : "name,last name,age"
for example:
person("jon,doe,30");
the output is:
person name: jon last name: doe age: 30
hint: use the split method to split the string to a string array where there is a "," char
 */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {
        //your code here
        String[] arr = info.split(",");
        System.out.print("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2] );
        //System.out.println();
    }//end person
}
