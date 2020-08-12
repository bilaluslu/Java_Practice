package homePractice_from_beginwithjava_com.Methods;

public class Q3 {
/*
Question 3

Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
and otherwise returns false.
In main() method accept a string from user and count number of vowels in that string.
 */

    public static void main(String[] args) {
        System.out.println(isVowel('a'));
    }

    public static boolean isVowel(char a) {
        if ( a == 'a' || a=='e'){
            return true;
        } else {
            return false;
        }
    }



}
