package day42_Inheritance;


class Test{
    public Test (int a){
        System.out.println("A");
    }
}



public class Constructors2 extends Test {

    public Constructors2() {
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {
        //Test obj = new Test(15);  // prints A
        Constructors2 obj2 = new Constructors2();   // prints A, B
    }

}
