package day36_Static_Block;

public class static_Block_4 {

    static String name;

    static {
        // gets executed as soon as  the class is loaded
        // designed to initialize static variable
        name = "Cybertek School";

    }

    public static void main(String[] args) {
        System.out.println( name );
    }


}
