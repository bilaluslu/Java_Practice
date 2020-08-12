package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {

        Person Bilal = new Person("Bilal");
        System.out.println( Bilal.name );

        //System.out.println(  Bilal.SSN  );  // because private

        Bilal.setSSN(12345678);
        System.out.println(   "Bilal' SSN: " + Bilal.getSSN()   );

        Bilal.setID(87654321);
        System.out.println(   "Bilal' SSN: " + Bilal.getID()    );

    }
}
