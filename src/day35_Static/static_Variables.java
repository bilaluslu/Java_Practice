package day35_Static;

public class static_Variables {

    int a2 = 200;   // instance variable

    static int a3 = 300;  // static variable
    public static void main(String[] args) {

        int a1 = 100;   // local variable only use in block

        static_Variables obj1 = new static_Variables();
        obj1.a2 = 1000;

        obj1.a3 = 4000;

        static_Variables obj2 = new static_Variables();
        obj2.a2 = 2000;

        obj2.a3 = 5000; // a3 is static so what we declare last it will return us last one

        System.out.println( obj1.a2 );
        System.out.println( obj2.a2 );

        System.out.println( obj1.a3 );  // 5000
        System.out.println( obj2.a3 );  // 5000

    }
}
