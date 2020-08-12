package day43_MethodOverriding;
/*
1. create a class called ShapeActions:
                methods: calculateArea(), calculatePerimeter()
 */
public class Shape {

    public double area;
    public double perimeter;

    public void calculateArea(){
        area = 0;
        System.out.println("area" + area);
    }

    public void calculatePerimeter(){
        perimeter = 0;
        System.out.println("perimeter" + perimeter);
    }

}
