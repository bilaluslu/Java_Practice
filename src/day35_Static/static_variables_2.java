package day35_Static;

public class static_variables_2 {

    int insVariable;            // every single object of the class has its own copy
    static int staticVariable;  // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        static_variables_2 obj1 = new static_variables_2();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        static_variables_2 obj2 = new static_variables_2();

        System.out.println( obj1.insVariable ); //300
        System.out.println( obj2.insVariable ); //0
        System.out.println();

        System.out.println( obj1.staticVariable );  //400
        System.out.println( obj2.staticVariable );  //400
        System.out.println();

        System.out.println( static_variables_2.staticVariable );    // static can be called through class name
        //System.out.println( staticVariable.insVariable );   //instance CANNOT be called through class name


    }




}
