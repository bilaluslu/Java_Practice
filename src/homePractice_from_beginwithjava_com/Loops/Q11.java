package homePractice_from_beginwithjava_com.Loops;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

       /* Question 11
       Write a program to enter the numbers till
        the user wants and at the end it should display
        the count of positive, negative and zeros entered.  */


       Scanner input = new Scanner(System.in);
       System.out.println("If you wanna exit type 'exit' \nEnter number");

       int a = 1 ;
       int  num;
       String check;
       int count1 = 0;
       int count2 = 0;
       int count3 = 0;

       while ( a == 1 ) {
           check = input.next();
            if(check.equalsIgnoreCase("exit"))
                break;
            else {
                if ( Integer.parseInt(check) > 0 ){
                    count1 += 1;
                }
                if ( Integer.parseInt(check) == 0){
                    count2 += 1;
                }
                if ( Integer.parseInt(check) < 0 ){
                    count3 += 1;
                }
            }

       }
        System.out.println("Positive number amount: " + count1);
        System.out.println("Negative Number amount: " + count3);
        System.out.println("Number of zero: " + count2);























    }
}
