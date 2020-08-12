package day14_StringClass;

import java.util.Scanner;

public class warm_Up_3_Middle_Char {
    public static void main(String[] args) {
        /*3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph

*/

        Scanner input =new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.next();
        String middleCharacter = "";
        int totalchar = word.length();
        int middleNumber = totalchar/2;

        if (totalchar % 2 != 0) {

           middleCharacter = middleCharacter + word.charAt(middleNumber);
            System.out.println(middleCharacter);
        }

        else {
           middleCharacter = middleCharacter + word.charAt(middleNumber-1)+word.charAt(middleNumber);
            System.out.println(middleCharacter);

            //middleCharacter += word.charAt(middleNumber - 1) + word.charAt(middleNumber);
            //  gives integer

        }

















    }
}
