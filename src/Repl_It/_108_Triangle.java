package Repl_It;

import java.util.Scanner;

public class _108_Triangle {
    public static void main(String[] args) {


        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for ( i=1; i <= n ; i++ ) {

            for ( j=1; j <= i ; j++ ) {

                System.out.print("* ");
            }
            System.out.println();
        }










    }
}
