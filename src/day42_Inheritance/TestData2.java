package day42_Inheritance;

public class TestData2 extends Accessmodifiers {
    public static void main(String[] args) {

        System.out.println( TestData2.publicVariable );
        System.out.println( TestData2.protectedVariable );
        System.out.println( TestData2.defaultVariable );
        //System.out.println( TestData2.privateVariable ); //private: only visible within the same class

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();
        //TestData2.privateMethod();    // private: only visible within the same class
    }

}
