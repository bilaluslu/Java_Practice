package day42_Inheritance.Task02;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","E250",500,"55 inches");

        System.out.println( tv1 );  // country is China
        tv1.country = "USA";
        System.out.println( tv1 );  // country is USA

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Phone phone1 = new Phone("Iphone","11",1000,"large");

        System.out.println( phone1 );


    }
}
