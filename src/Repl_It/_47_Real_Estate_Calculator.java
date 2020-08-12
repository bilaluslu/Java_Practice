package Repl_It;

import java.util.Scanner;

public class _47_Real_Estate_Calculator {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");



        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();

        if(backyard) {
            if (houseType.equalsIgnoreCase("condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                propertyPrice += 5000;
            }
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();

        if (garage) {

            if (garageSpots <= 10) {
                propertyPrice += (garageSpots * 20000);
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextInt();
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();

        propertyPrice += houseType.equalsIgnoreCase("CONdo") ? 50000
                : houseType.equalsIgnoreCase("townhouse") ? 75000
                : houseType.equalsIgnoreCase("single family home") ? 95000 : 0;

        System.out.println("1 " + propertyPrice);

        propertyPrice += (numberOfBedrooms == 1) ? +30000 : (numberOfBedrooms == 2) ? +60000
                : (numberOfBedrooms == 3) ? +90000 : (numberOfBedrooms == 4) ? +120000
                : (numberOfBedrooms == 5) ? +150000 : (numberOfBedrooms == 6) ? +180000
                : (numberOfBedrooms == 7) ? +210000 : (numberOfBedrooms == 8) ? +240000
                : (numberOfBedrooms == 9) ? +270000 : (numberOfBedrooms == 10) ? +300000
                : (numberOfBedrooms == 11) ? +330000 : (numberOfBedrooms == 12) ? +360000 : 0;

        System.out.println("2 " + propertyPrice);


        propertyPrice += ( metroAccessibility <= 1 ) ? +10000
                : ( metroAccessibility > 1 && metroAccessibility < 3) ? +5000 : 0;

        System.out.println("3 " + propertyPrice);

        propertyPrice += ( highwayAccessibility <= 1 ) ? +15000
                : ( highwayAccessibility > 1 && highwayAccessibility < 5 ) ? +8000
                : ( highwayAccessibility >= 5 && highwayAccessibility <= 20 ) ? +4000 : 0;

        System.out.println("4 " + propertyPrice);

        propertyPrice += ( schoolScore <= 10 && schoolScore >= 8 ) ? + 45000
                : ( schoolScore >= 4 && schoolScore < 8 ) ? + 20000
                : ( schoolScore < 4 ) ? +5000 : 0;

        if ( smoking ) {
            propertyPrice -= 5000;
        }

        System.out.println("Market report has been generated.");

        System.out.println("Your estimate market price is: " + propertyPrice + "$" );

























    }
}
