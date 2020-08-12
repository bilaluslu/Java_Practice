package day46_final_abstract;

public class Rectangle extends Shape {

    public double side1;
    public double side2;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public void Area(){
        double area = side1 * side2;
        System.out.println(   "Area of rectangle: " + area   );
    }

}
