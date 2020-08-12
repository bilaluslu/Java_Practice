package day28_Date_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(5,30);
        System.out.println( time1.format(dtf1) );

        LocalTime time2 = LocalTime.of(10,0);
        System.out.println( time2.format(dtf1) );

        LocalTime time3 = LocalTime.of(0,0);
        System.out.println( time3 );

        LocalTime time4 = LocalTime.of(14,14);
        System.out.println( time4.format(dtf1) );




    }
}
