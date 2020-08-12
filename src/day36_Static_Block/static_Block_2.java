package day36_Static_Block;

import day34_Custom_Class.Testers;

public class static_Block_2 {

    static int a;
    static int b;
    int c;

    static Testers tester1 = new Testers();

    public static void main(String[] args) {
        tester1.setTesterInfo("Jean",123,"SDET",120000);
        System.out.println(tester1);
    }



    static {
        a= 100;
        b= 200;
        //c= 300;   // static only accepts static because we cannot initialize c
        if ( 100 > 200 ) {
            a = 100;
        } else {
            b = 200;

        }


    }


}
