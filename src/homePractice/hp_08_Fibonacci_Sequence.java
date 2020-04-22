package homePractice;

import java.util.Scanner;

public class hp_08_Fibonacci_Sequence {
    public static void main(String[] args) {


        int n;
        int sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of element in the array: ");
        n = num.nextInt();
        int[] a = new int[n];
        a[0] = 0; a[1] = 1;

        for (int i = 2 ; i < a.length ; i++) {
            a[i] = a[i-1] + a[i-2];

        }

        for (int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }













        }
    }


