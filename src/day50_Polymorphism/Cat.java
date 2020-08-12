package day50_Polymorphism;

public final class Cat extends Animal{    // 3 variables, 3 instance methods

    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Cat " + catName + " is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Cat " + catName + " is sleeping");
    }
    public void scratch(){
        System.out.println("Cat " + catName + " is scratching");
    }




}
