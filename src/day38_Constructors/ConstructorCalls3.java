package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(9);    // int argument
        System.out.println("default");
    }
    public ConstructorCalls3(int a){
        System.out.println("int argument");
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }


}
