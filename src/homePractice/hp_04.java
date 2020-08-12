package homePractice;

import java.util.Scanner;

public class hp_04 {
    public static void main(String[] args) {

        /*Write a Java program that keeps a number from the user and generates an integer
        between 1 and 7 and displays the name of the weekday. Go to the editor

        Test Data
        Input number: 3
        Expected Output :
        Wednesday*/

        Scanner day = new Scanner(System.in);
        int day1 = day.nextInt();

        if (day1 == 1){
            System.out.println("Monday");
        }
        else if (day1 == 2) {
            System.out.println("Tuesday");
        }
        else if (day1 == 3) {
            System.out.println("Wednesday");
        }
        else if (day1 == 4) {
            System.out.println("Thursday");
        }
        else if (day1 == 5) {
            System.out.println("Friday");
        }
        else if (day1 == 6) {
            System.out.println("Saturday");
        }
        else if (day1 == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
