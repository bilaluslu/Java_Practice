package day37_Constructors;

public class test {

    static String name = "aaron";

    public static void main(String[] args) {
        System.out.println("dan");
    }
    public static void print (String str){
        System.out.println(str);
    }
    static {
        print(name);
    }
}
