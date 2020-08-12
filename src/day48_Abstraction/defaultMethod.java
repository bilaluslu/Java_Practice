package day48_Abstraction;

abstract class T {
    //public default void method2(){ }
}

public interface defaultMethod {

    default void method() {     // only for interface
        System.out.println("default method");
    }
}
