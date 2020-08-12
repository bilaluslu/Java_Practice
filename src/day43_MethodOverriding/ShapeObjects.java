package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1= new Circle(4);

        System.out.println( "radius is: " +  circle1.radius );

        circle1.calculateArea();  // bug    suppose to be : PI * radius * radius  // fixed
        circle1.calculatePerimeter(); // bug    suppose to be : 2 * PI * radius  // fixed
        // to fix it we override method in their class

        System.out.println("=================================");

        Rectangle rectangle1 = new Rectangle(5,2);

        System.out.println("length is: " +  rectangle1.length );
        System.out.println( "width is: " + rectangle1.width );

        rectangle1.calculateArea();     //bug   suppose to be : length * width  // fixed
        rectangle1.calculatePerimeter();    //bug   suppose to be : 2 * ( length + width )  // fixed
        // to fix it we override method in their class

        System.out.println("==================================");

        Square square1 = new Square(4);

        System.out.println( "side is: " +  square1.side );

        square1.calculateArea();    // bug  suppose to be : side * side  // fixed
        square1.calculatePerimeter();   //bug   suppose to be : 4 * side  // fixed
        // to fix it we override method in their class




    }

}
