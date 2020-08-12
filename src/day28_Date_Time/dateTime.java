package day28_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // 2020-03-20 11:25:30
        LocalDate date = LocalDate.of(2020,3,20);
        LocalTime time = LocalTime.of(11,25,30);
        // combination of "date" and "time"
        LocalDateTime DateTime = LocalDateTime.of(date,time);
        System.out.println(DateTime);

        // 2020-03-20 11:25:30
        // directly declaration
        LocalDateTime DateTime2 = LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(DateTime2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");   // returns 03/20 doesnt return year
        LocalDate date2 = LocalDate.of(2020,3,20);
        System.out.println( date2.format(dtf));






    }
}

