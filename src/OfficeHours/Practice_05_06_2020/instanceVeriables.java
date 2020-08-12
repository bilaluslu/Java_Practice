package OfficeHours.Practice_05_06_2020;

public class instanceVeriables {

    int a = 100; // instance variable: belongs to the object

    public static void main(String[] args) {
        //  int a = 100;  // local variable

        instanceVeriables obj1 = new instanceVeriables();
        obj1.a = 300;

        System.out.println(300);


        instanceVeriables obj2 = new instanceVeriables();
        System.out.println( obj2.a );


    }
}
