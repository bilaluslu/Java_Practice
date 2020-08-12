package day24_Methods;

public class birthday_Calculator {

    public static void Age ( int birthYear ) {
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if ( age > 0 && birthYear > 1900 ) {
            System.out.println(age);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {

        Age(2002);
    }
















}
