package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r = input.nextDouble();

        Circle circle1 = new Circle( r );
        double areaOfCircle = circle1.area();
        double perimeterOfCircle = circle1.perimeter();
        System.out.println( "Area is: " + df.format(areaOfCircle) );
        System.out.println( "Perimeter is: " + df.format(perimeterOfCircle) );



    }
}


