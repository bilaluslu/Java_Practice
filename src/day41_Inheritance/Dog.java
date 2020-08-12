package day41_Inheritance;

public class Dog extends Animal {
    /*
    public String name;
    public String size;
    public double weight;
    public void eat(){
        System.out.println( name + " is eating");
    }
    public void move(){
        System.out.println( name + " is moving");
    }
     */
    public void bark(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();
        dog1.bark();



    }
}

