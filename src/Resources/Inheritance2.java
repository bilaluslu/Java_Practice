package Resources;

import day42_Inheritance.Accessmodifiers;

public class Inheritance2 extends Accessmodifiers {
        //      sub                   super

    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        //System.out.println( Inheritance2.defaultVariable ); // default: only visible in same package
        //System.out.println( TestData2.privateVariable ); //private: only visible within the same class

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
        //Inheritance2.defaultMethod();     // default: only visible in same package
        //Inheritance2.privateMethod();    // private: only visible within the same class
    }





}
