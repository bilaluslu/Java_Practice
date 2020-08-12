package day46_final_abstract;

public class final_method {
    //any method we con overload

    public final void method1(){

    }
    public final int method1(int a){
        return 100;
    }

    public final static void main(String[] args) {
        // static method never override
    }
/*
    public final final_method(){
        //final methods canNOT be override , can be overload
        //constructors canNOT be final
    }
*/

}
