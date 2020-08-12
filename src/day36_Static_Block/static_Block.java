package day36_Static_Block;

public class static_Block {

    public static void main(String[] args) {
        System.out.println("main method executed");
        method1();
    }

        public static void method1() {
        System.out.println("custom method executed");
    }

    static {
        System.out.println("static block executed");
    }



}
