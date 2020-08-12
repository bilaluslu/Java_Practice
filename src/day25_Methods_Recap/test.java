package day25_Methods_Recap;
import Resources.Library;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str3 = "aaaaasssssccccmmmmggggggggnnnnbbbbbcccc";
        String result1 = Library.FrequencyOfChars(str3);
        System.out.println(result1);
*/


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String result = "";

        for ( int i = 0 ; i < words.length ; i++ ) {

            result += (words[i].substring(0,1) + words[i].substring(words[i].length()-1)) + "\n" ;
            //System.out.println(Arrays.toString(words));
        }

        System.out.print(result);




    }

}
