package day27_Date_Time;

import java.time.LocalDate;

public class dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,12);

        System.out.println(date1);
        System.out.println("---------------");

        LocalDate birthday = LocalDate.of(2020,9,24);

        System.out.println(birthday);
        System.out.println("---------------");

        // isAfter(date);
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);
        System.out.println("---------------");

        // isBefore(date);
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);
        System.out.println("---------------");

        // isEqual(date);
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);
        System.out.println("---------------");

        // isLeapYear(date);
        boolean result4 = date1.isLeapYear();
        System.out.println(result4);
        System.out.println("---------------");

        LocalDate now = LocalDate.now();    //  2020-04-23
        System.out.println("Today is: " + now);
        System.out.println("---------------");

        // toString();
        String str = now.toString();
        System.out.println(str);









    }
}
