package day18_Nested_Loop;

import java.util.Scanner;

public class nested_Loop_Triangle {
    public static void main(String[] args) {

        /*
                *
                * *
                * * *
                * * * *
                * * * * *
         */
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            for ( ; i <= n ; i++ ) {

                for (; j <= i; j++) {

                    System.out.print("* ");

                } System.out.println();
            }

        System.out.println("=========================================");
/*
        for ( int i = 1 ; i <= 6 ; i++ ) {

            for (int j = 1; j <= i; j++) {


                System.out.print("* ");

            } System.out.println();
        }
        for ( int i = 1 ; i <= 5 ; i++ ) {

            for (int j = 5 ; i <= j ; j--) {

                System.out.print("* ");

            } System.out.println();
        }

        System.out.println("====================================");

        for ( int i = 1 ; i <= 5 ; i++ ) {

            for (int j = 5 ; i <= j ; j--) {

                System.out.print("* ");

            } System.out.println();
        }

        System.out.println("===============================");
        /*  a
            a b
            a b c
            a b c d
            a b c d e
         */

        for ( char ch1 = 'a' ; ch1 <= 'e' ; ch1++ ) {

            for (char ch2 = 'a'; ch2 <= ch1; ch2++) {

                System.out.print(ch2 + " ");
            }
            System.out.println();
        }

        System.out.println("===========================================");

        for ( char ch1 = 'e' ; ch1 >= 'a' ; ch1-- ) {

            for (char ch2 = 'a'; ch2 <= ch1; ch2++) {

                System.out.print(ch2 + " ");
            }
            System.out.println();
        }











    }
}
