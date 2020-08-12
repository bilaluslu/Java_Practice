package Repl_It;

import java.util.Scanner;

public class _92_Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;

        for ( int i = 1 ; i <= n ; i++) {
            count *=i;

        }
        System.out.println(count);

    }
}
