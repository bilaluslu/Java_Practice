package day26_Method_Overloading;

public class method_Overloading_2 {
/*
    first method : print sum of two int numbers
    second method : print sum of three int numbers
    third method : print sum of four int numbers
 */
public static void main(String[] args) {

    // 10 , 5
    sum2Numbers(10,5);      //output is 15

    // 10 ,5 ,15
    sum3Numbers(10,5,15);   //output is 30

    // 10 , 20 ,30 ,5
    sum4Numbers(10,20,30,5);    //output is 65

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    // 15 , 10
    sum(15,10);      //output is 25

    // 5 , 10 , 8
    sum(5,10,8);      //output is 23

    // 15 , 4 , 12 , 7
    sum(15,4,12,7);      //output is 38

}

    // these are regular methods
    public static void sum2Numbers ( int a , int b ) {
        System.out.println(a+b);
    }
    public static void sum3Numbers ( int a , int b , int c ) {
        System.out.println(a+b+c);
    }
    public static void sum4Numbers ( int a , int b , int c , int d ) {
        System.out.println(a+b+c+d);
    }

    //-----------------------------------------------------------------


    // these are overloaded methods
    public  static void sum ( int a , int b) {
        System.out.println(a+b);
    }
    public static void sum ( int a , int b , int c ) {
        System.out.println(a+b+c);
    }
    public static void sum ( int a , int b , int c , int d ) {
        System.out.println(a+b+c+d);
    }











}
