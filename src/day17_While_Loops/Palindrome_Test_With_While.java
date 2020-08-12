package day17_While_Loops;

public class Palindrome_Test_With_While {
    public static void main(String[] args) {

        String str = "level";

        String reservedStr = "";    // store the reserved version of str

        int index = str.length()-1;     // last index number

        while ( index >= 0 ) {

            reservedStr += str.charAt(index);
            index--;
        }
        boolean palindrome = reservedStr.equals(str);

        System.out.println(palindrome);




















    }
}
