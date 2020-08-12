package day10_Switch_Scanner;

public class warm_up_days {
    public static void main(String[] args) {

        /*  1. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE NESTED IF
        2. do with ternary
        */

        // 1.
        int num = 3;
        String result = "";
        String result2 = "";

        if ( num > 0 && num < 8) {

            if ( num == 1) {
                result = "Monday";
            }
            else if ( num == 2) {
                result = "Tuesday";
            }
            else if ( num == 3) {
                result = "Wednesday";
            }
            else if ( num == 4) {
                result = "Thursday";
            }
            else if ( num == 5) {
                result = "Friday";
            }
            else if ( num == 6) {
                result = "Saturday";
            }
            else {
                result = "Sunday";
            }


        } else {
            System.out.println("Invalid");
        }
        System.out.println("Result: " + result);


        //2.

        result2 = (num==1) ? "Monday" : (num==2) ? "Tuesday" : (num==3) ? "Wednesday" :
                        (num==4) ? "THursday" : (num==5) ? "Friday" : (num==6) ? "Saturday" :
                             (num==7) ? "Sunday" : "Invalid" ;

        System.out.println("Result 2: " + result2);








    }
}
