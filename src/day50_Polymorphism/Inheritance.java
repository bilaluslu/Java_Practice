package day50_Polymorphism;

public class Inheritance {
    /*
    Inheritance: build super & sub class, easy way to get rich

        super class:
        sub class: can inherit visible variables and visible methods (except constructor) from super class

            class   A   extends    B
                   sub            super
        method overriding: MUST happen in sub class
        advantage:  less code
                    reusable
                    easy to maintain
     */
    public int publicInt = 100;
    protected int protectedInt = 200;
    int defaultInt = 300;
    private int privateInt = 400;

}

class Data extends Inheritance {

}