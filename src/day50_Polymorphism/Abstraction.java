package day50_Polymorphism;

interface I{
    void method2(); // public abstract, we can oly use public in interface
    abstract int method3();

   // {  }    // instance block, we cannot have in interface

   // static { }  // static , we cannot have in interface

}
abstract class A{

    {  }    // instance block

    static { }  // static block

    public A(){}    // we can have constructor

    public abstract void method1();
    public abstract void method4(); // under abstract class we must give abstract keyword
}


public class Abstraction extends A implements I {
    /*
    Abstraction:  hiding the implementation details
                  concentrating on essential/importance, without worrying the details

    Abstract Method:    method without body/implementation
                        meant t obe override ( canNOT be final, static, private)
    There are ONLY two ways to achieve abstraction:
        1. abstract class: not concrete, cannot create object
                           meant to be inherited (can NOT be final)

        2. interface:   we can implement multiple interfaces to a class
                        everything has public access modifier
                        we can only have:
                                variables: by default static and final
                                methods: abstract method, static method, default method
                        we cannot have: constructor, instance variables, instance methods, blocks


             Extends  vs  Implements
             class      extends     class
             interfaces extends     interface
             class      implements  interface

             class extends class implements I1, I2
     */
    @Override
    public void method1(){ }

    @Override
    public void method4() { }

    @Override
    public void method2() { }

    @Override
    public int method3() {
        return 0;
    }
}
