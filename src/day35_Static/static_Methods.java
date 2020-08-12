package day35_Static;

public class static_Methods {

    int a = 100;
    static int b = 200;


    public static void main(String[] args) {

        //System.out.println( a );    // returns compile error we CANNOT call instance variables, static accepts static
        // we can cal 'a' by using object

        static_Methods obj = new static_Methods();

        System.out.println( obj.a );
        System.out.println("-------");

        System.out.println( b );
        System.out.println( static_Methods.b );
    }
    public void method(){
        System.out.println( a );
        System.out.println( b );
    }





}
