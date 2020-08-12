package day26_Method_Overloading;

public class method_Overloading {

    public static void main(String[] args) {
        method(10);     // prints us original method
        method(10.0);   //prints us overloaded method
    }
    public static void method (int a) {
        System.out.println("Original Method");
    }
    public static void method ( double a ) {
        System.out.println("Overloaded Method");
    }











}
