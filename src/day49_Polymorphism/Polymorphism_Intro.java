package day49_Polymorphism;

import java.awt.*;

interface Animal{

}

class  Dog implements Animal {

}

class  Cat implements Animal {

}

class Robot {

}


public class Polymorphism_Intro {
    public static void main(String[] args) {

        //Animal obj = new Animal();  // you can NEVER create object fro abstract and interface
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();    // because we create from Cat because we canNOT create from Animal( animal is interface)
        // Dog obj4 = new Cat();    // we have to have IS A relation. becaues it gives compile error.
                                    // There is no relation cat and dog
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot(); // we can NOT store obj7 in Animal array because there is no relation

        //String[] animalShow = { obj2 , obj3 , obj5 , obj6 }; // because they are not String object
        Animal[] animalShow = { obj5 , obj6 }; // when we make datatype Animal, we can store them.
                                                // Because there is a IS A relation

        // sub class can NEVER EVER be the reference type of super class



    }

}
