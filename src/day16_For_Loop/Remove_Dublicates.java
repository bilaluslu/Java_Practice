package day16_For_Loop;

import java.util.Scanner;

public class Remove_Dublicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine() ;
        String result = "";

        for ( int i = 0 ; i < str.length() ; i++) {
            if( !result.contains(""+ str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println("with if: " + result);

        String result1 = "";

        /*
        for ( int i = 0 ; i < str.length() ; i++) {
            if( result1.contains("" + str.charAt(i))) {
                continue;
            }
            result1 += str.charAt(i);
        }
        System.out.println("with continue: " + result1);

*/







    }
}
