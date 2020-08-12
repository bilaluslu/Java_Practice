package day28_Date_Time;

import java.time.LocalDate;

public class localDate_Practice {
    public static void main(String[] args) {
/*
1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */

        String[] friends = { "John" , "Aaron" , "Daniel" };
        LocalDate johnBirthday = LocalDate.of(2020,3,5);
        LocalDate aaronBirthday = LocalDate.of(2000,10,12);
        LocalDate danielBirthday = LocalDate.of(2010,5,6);

        LocalDate[] birthdays = { johnBirthday , aaronBirthday , danielBirthday };

        for ( int i = 0 ; i < friends.length ; i++ ) {
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println( name + "'s birthday is " + bd );
        }

        /*
        cd src [enter]
        cd day28_Date_Time [enter]
        git status [enter]  { gives us new file:
        git add -localDate_Practice.java [enter]
        git commit -m "Day28 Class" [enter]
        git push [enter]

         */



    }
}
