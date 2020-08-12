package day48_Abstraction;

public interface Interface_Intro {

    public abstract void method1();

    public void method2();   // abstract by default

    void method3(); // public by default
                    // in interface we DON'T need to give public or abstract, they come by default
                    // we canNOT give protected.

    // Interface canNOT be SUPER class but can be super type to a class

}
