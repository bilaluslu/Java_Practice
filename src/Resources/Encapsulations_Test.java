package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        // System.out.println(  obj.SSN );  // compile error

        System.out.println(   obj.getSSN()   ); // returns 0

        obj.setSSN(12345678);

        System.out.println(    obj.getSSN()    );    // returns 12345678


    }
}
