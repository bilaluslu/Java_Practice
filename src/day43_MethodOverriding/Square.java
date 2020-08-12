package day43_MethodOverriding;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side = side;
    }

    /*
    inherited from Shape class
                 area, perimeter
                 calculateArea() and calculatePerimeter()
     */

    public void calculateArea(){
        area = side * side;
        System.out.println("area of the square: " + area);
    }
    public void calculatePerimeter(){
        perimeter = 4 * side;
        System.out.println("perimeter of the square: " + perimeter);
    }

}
