package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method2(){ }
}

public class Abstract_VS_NonAbstract2 extends A {   // MANDATORY to override the abstract method
    @Override
    public void method1(){ }
}

abstract class B extends A {    // optional t ooverride the abstract method of A
    // one abstract & one instance method
}

class C {
    public void method1(){ }
}
