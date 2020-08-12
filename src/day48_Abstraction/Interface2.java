package day48_Abstraction;

public interface Interface2 {

    //int a;  // we have to initialize right away
    // public static final int a = 100; // we can also declare this way but color is gray means that we
                                    // do NOT have to give them
    int a = 100;

    // public Interface2() { }  no constructor

    // public void method1() { }    no methods

    // { } no blocks



    public static void main(String[] args) {
        System.out.println(  a  );  // by default static

        // a = 200; // cannot assign a value final variable, it is by default final

        System.out.println(  Interface2.a);
        Interface2.method4();




    }

    static void method4() { }

    void method5();

    default void method6() {
        System.out.println("default method");
    }

}
