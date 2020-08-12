package day27_Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates_Formatting {
    public static void main(String[] args) {
/*
        // If I don't like the format, I need to call the DateTimeFormatter class
// then I provide what format I will like to use to format date
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
 year: yy, yyyy
 Month: MM, MMM (capital M for month, small m for minutes)
 day : dd
        System.out.println(date1.format(dtf));  //  2020/04/23
//OR
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM prints month as 2 digit number
        System.out.println(date1.format(dtf2)); //  04/23/2020
//OR
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy"); // MMM will print first 3 letters of month
        System.out.println(date1.format(dtf3)); //  Apr 23, 2020
// OR
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date1.format(dtf4)); //  23/Apr/2020
*/

        // year     ==> yy or yyyy
        // months   ==> MM (03,11, etc.) or MMM (Dec, Sep, etc.) or MMMM ( March, June, etc.)
        // days     ==> dd

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));      // output is 2020/04/23

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //create a date called birthday: month/days/year

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yy");

        LocalDate birthday = LocalDate.of(1988,9,24);
        System.out.println(birthday.format(dtf2));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
        LocalDate today = LocalDate.now();
        System.out.println( "Day name 3 letters: " + today.format(dtf3) );

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        LocalDate today2 = LocalDate.now();
        System.out.println( "Full day name: " + today2.format(dtf4) );





    }
}
