package OfficeHours.Practice_03_11_2020;

public class Practice_Escape_Sequences {
    public static void main(String[] args) {

        System.out.println("\t\"Java\" is a \nprogramming language");

        System.out.println("I love the Tv show \"asdfasdf\"");

        String brand = "BMW";
        short year = 2020;
        float price = 50000.5f;
        String model = "X6";
        short maximumMiles = 32767;

        System.out.println("The vehicle "+year+ " "+brand+ " " + model+ ", has "+maximumMiles+ " miles, price is "
                            +price+ " dollars");


    }
}
