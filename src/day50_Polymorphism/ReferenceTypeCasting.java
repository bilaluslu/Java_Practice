package day50_Polymorphism;

import day33_Custom_Class.Car;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        int a = 100;
        double b = a;   // implicitly done

        // upcasting : casting from subclass type to superclass type (done by compiler implicitly)
        // downcasting: casting from a superclass type to subclass type (must be done explicitly)

        Dog dog = new Dog("A",1,"f");
        Animal animal1 = dog;   // implicitly done (upcasting)

        Cat cat = new Cat("as","m",2);
        //Dog dog2 = (Dog)cat;   // we cannot cast because no relation each other
        Animal animal2 = cat;   // implicitly done (upcasting)

        System.out.println("=========================================");

        double c = 10;
        int d = (int) c;    // explicitly done

        Animal animal3 = new Dog("qw",2,"m");

        Dog dog3 = (Dog)animal3;    // down casting, MUST be done manually

        Animal animal4 = new Cat("fgsd","f",4);

        Cat cat2 = (Cat) animal4;

        System.out.println("=========================================");

        Animal animal5 = new Dog("lu",1,"f");
        //animal5.bark();

        // first way
        Dog dog2 = (Dog) animal5;
        dog2.bark();
        // second way
        ( (Dog) animal5 ).bark();



    }
}
