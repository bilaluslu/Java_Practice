package Repl_It;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class atest_TimeConversition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        // 02:15:24AM
        int time = Integer.parseInt(s.substring(0,2));
        if ( s.endsWith("AM")){
            time += 12;
            System.out.println(s);
        }


    }
}
