package homePractice;

import java.util.Scanner;

public class hp_11_Word_Counter_While {
    public static void main(String[] args) {

        // 1. WORD COUNTER WITH WHILE
        // 2. FINDS EVEN NUMBER WITH WHILE LOOP
        // 3. FINDS EVEN NUMBER WITH FOR LOOP AND USER INPUT
        // 4. FINDS EVEN NUMBER WITH WHILE LOOP AND USER INPUT


        // 1. WORD COUNTER WITH WHILE
        String str = "I like book, book is good, book, book" ;
        // it changes the original string but it counts what you ask
        int count = 0;

        while ( str.contains("book")) {
            count++;
            str = str.replaceFirst("book" , "") ;
            //if wo dont use replace first method it wont count right it wont return false
            // it is infinite loop if we dont use replace first method
        }
        System.out.println(count);

        // 2. FINDS EVEN NUMBER WITH WHILE LOOP
        int x = 1;
        while ( x <= 20) {
            if ( x % 2 == 0) {
                System.out.print( x + " ");
            }
            x++;
        }
        System.out.println("\n================\n");
/*
        // 3. FINDS EVEN NUMBER WITH FOR LOOP AND USER INPUT
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting Number");
        int start = scan.nextInt();
        System.out.println("Ending Number");
        int end = scan.nextInt();

        for (int j = start ; j < end ; j++) {
            if ( j % 2 == 0){
                System.out.print(j);
            }
        }
*/
        // 4. FINDS EVEN NUMBER WITH WHILE LOOP AND USER INPUT

        Scanner scan = new Scanner(System.in);
        System.out.println("Starting Number");
        int start = scan.nextInt();
        System.out.println("Ending Number");
        int end = scan.nextInt();

        int j = start ;
        while ( j <= end ) {
            if ( j % 2 == 0) {
                System.out.println(j +" ");
            }
            j++;
        }




    }
}
