package day51_Recap;

public final class Circle extends Shape implements PI { // we have 3 variables now
    public double radius;
    public Circle(double radius){
        this.radius = radius;
        name = "Circle";
    }

    @Override
    public double calculateArea(){
        return radius*radius*PI;
    }
    @Override
    public double calculatePerimeter(){
        return 2*radius*PI;
    }

}
