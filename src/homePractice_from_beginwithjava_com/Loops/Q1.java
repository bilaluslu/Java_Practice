package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

       // Question 1
        //Write a program to print numbers from 1 to 10.
/*
        for ( int i = 1 ; i <=10 ; i++) {
            System.out.print(i + " ");
        }

 */


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String reversed = "";
        String[] str = sentence.split(" ") ;


        for ( int i = 0 ; i <= str.length-1 ; i++ ) {

            reversed += str[i] + "\n ";

            reversed = reversed.substring( 0 , reversed.length()-1 ) ;

        }
        System.out.println(reversed);














    }
}
