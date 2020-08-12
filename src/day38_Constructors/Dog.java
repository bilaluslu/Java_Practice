package day38_Constructors;

import java.security.PublicKey;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog(){   // sets the default value for all instances
        name = "unknown";
        breed = "unknown";
        age = 0;
    }
    public Dog(String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;
    }
    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
    }
    public  String toString(){
        return "Name: "+name+", breed: "+breed+", age: "+age;
    }

}
