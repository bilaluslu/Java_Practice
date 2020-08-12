package day01_FirstProgramming;

public class HelloWorld {

    public static void main(String[] args ){
        /*float myNum= 5.99f;
        char myLetter='D';
        boolean myBool=true;
        String firstName="Bilal";
        String lastName="USLU";
        String fullName=firstName+ " " +lastName;*/
        //System.out.println("Hi My name is " + name)    ;

        int x=3;
        float y=5.99f;
        int z=2;

        //int myInt = 9;
        //double myDouble = myInt; // Automatic casting: int to double
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println((double)z);   // Outputs 9.78
        System.out.println((int)y);      // Outputs 9

        /*This is the first programming
            we learned how to print Hello World
         */
    }
}

