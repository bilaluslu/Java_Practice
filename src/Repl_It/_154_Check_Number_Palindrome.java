package Repl_It;

import java.util.Scanner;

public class _154_Check_Number_Palindrome {
/*
Complete a method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).
Example:
input: 1001
output: true
Example:
input: 1234
output: false
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int backUp= num;
        String newNumber ="";
        while ( num > 0 ) {
            newNumber += (num%10);
            num = num / 10;
        }
        //System.out.println(newNumber);
        if (backUp == Integer.parseInt(newNumber)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}
