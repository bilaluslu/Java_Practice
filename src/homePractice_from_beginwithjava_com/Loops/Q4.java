package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

       // Question 4
       // Write a program to find the factorial value of
        // any number entered through the keyboard.

      //  6! = 6*5*4*3*2*1
        // 5! = 5*4*3*2*1

        int num = 5;
        int result = 1;

        for ( int i = num ; i > 0 ; i-- ) {

            result =  result * i;
            //  1
            //          1    *5
            //5         5    *4
            //20        20   *3
            //60        60  * 2
            //120       120 * 1
            //120
        }
        System.out.println(result);






        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Positive Integer Number");
        int number = input.nextInt();
        int count = 1;

        for ( int i = number ; i >= 1 ; i--) {

            count = count * i;

        }
        System.out.println(count);
*/










    }
}
