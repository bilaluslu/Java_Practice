package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(  obj.SSN   ); // compile error

        System.out.println(    obj.getSSN()   );    // returns 0, we did not initialize yet

        //obj.SSN = 123456; // compile error

        obj.setSSN(123456);
        System.out.println(   obj.getSSN()   ); // returns 123456

    }
}
