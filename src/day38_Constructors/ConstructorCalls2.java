package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("default constructor");
    }

    public ConstructorCalls2(int a){
        this(); // returns "default constructor"
        System.out.println("constructor with int argument");
    }

    public ConstructorCalls2(String str) {
        //this(); // calls default cons.
        this(10);   // calls default and cons. with int argument
        System.out.println("constructor with String argument");
    }

    public static void main(String[] args) {
        //ConstructorCalls2 obj = new ConstructorCalls2();  // returns default cons.
        //ConstructorCalls2 obj2 = new ConstructorCalls2(10); //  returns default cons. and cons. with int arg
        ConstructorCalls2 obj2 = new ConstructorCalls2("Hello"); //  returns default cons. , cons. with int arg
                                                                 // ,cons. with String arg
    }


}
