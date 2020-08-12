package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep(){
        try {
            Thread.sleep(3000);
        } catch (Exception e){

        }
    }

    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void main(String[] args) {

        System.out.println("Cybertek");
        sleep();
        //sleep2(); // if we call sleep2 it returns compile error, this is disadvantage of throws keyword
                    // to fix it ==>  public static void main(String[] args) throws Exception olarak yazilir
        System.out.println("Java");

    }
    // disadvantage of throes method,caller of method

    public static void method1() throws Exception {
        String[] arr = {"A"};
        main(arr);

    }


    public static void method2(){
        try {
            method1();
        }catch(Exception e){

        }
    }

    public static void method3(){

        method2();
    }

}
