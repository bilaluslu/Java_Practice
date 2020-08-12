package day14_StringClass;

import java.util.Scanner;

public class warm_Up_Combine_Two_String {
    public static void main(String[] args) {

        /*1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
					*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println(word1.concat(" ").concat(word2));
        System.out.println( );
        System.out.println(word2.concat(word1));

















    }
}
