package day19_Arrays;

import java.util.Scanner;

public class arrays_Practice_2 {
    public static void main(String[] args) {


        // if we give the values of arrays , siz will be initialized automatically

        int[] arr = { 10, 20 ,30 };
        System.out.println(arr.length);     // output is 3

        // another way to initialize  the size of the array, giving the size only
        // int[] arr = new int[length];

        int[] arr2 = new int[5];

        System.out.println( arr2[2] );    // output is 0 because we did NOT initialize

        String[] arr3 = new String[3];

        arr3[0] = "Bilal";
        arr3[1] = "Ali";
        arr3[2] = "Veli";       // this 3 shows us we declared arrays' element

        System.out.println( arr3.length ); // gives us  length of array  3

        System.out.println( arr3[0] );    // output is Bilal
        System.out.println( arr3[1] );    // output is Ali
        System.out.println (arr3[2] );    // output is Veli

        System.out.println("=================================");


        // write a program that asks "enter a name" 10 times, and store each of
        // the names in the array students

        Scanner input = new Scanner(System.in);

        String[] students = new String[10];

        for ( int i = 1 ; i < 11 ; i++ ) {
            System.out.print(i + "- enter name: ");
            students[i] = input.nextLine();
        }





































    }
}
