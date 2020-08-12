package day43_MethodOverriding;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /*
    inherited from Shape class
                 area, perimeter
                 calculateArea() and calculatePerimeter()
     */

    public void calculateArea(){
        area = length * width;
        System.out.println("area of the rectangle: " + area);
    }
    public void calculatePerimeter(){
        perimeter = 2 * ( length + width );
        System.out.println("perimeter of the rectangle: " + perimeter);
    }


}
