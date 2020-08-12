package day50_Polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy",5,"F");
        System.out.println( dog1.dogName);
        dog1.bark();

        Animal dog2 = new Dog("Kito",6,"M");
        //System.out.println( dog2.dogName);
        //dog2.bark();  // we cannot call these methods they are not in animal class
            // reference type decides what can be called or accessed
        dog2.eat(); // it executed first, overridden one(from dog class). if there is no overridden method it executes
                    // animal class one

        dog2.methodA();
        Dog.methodA(5);


        Animal animal1 = new Cat("A","f",1);
        boolean isDog = animal1 instanceof Dog; // instanceof keyword verifies reference of class
        System.out.println(  isDog  );  // false

        boolean isCat = animal1 instanceof Cat;
        System.out.println(  isCat  );  // true







    }
}
