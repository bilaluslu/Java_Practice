package day43_MethodOverriding;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    /*
    inherited from Shape class
                 area, perimeter
                 calculateArea() and calculatePerimeter()
     */

    public void calculateArea(){
        area = PI * radius *radius;
        System.out.println("area of the circle: " + area);
    }
    public void calculatePerimeter(){
        perimeter = 2 * PI * radius;
        System.out.println("perimeter of the circle: " + perimeter);
    }

}
