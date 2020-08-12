package day29_Wrapper_ArrayList;

import java.util.ArrayList;
public class list_Intro {
    public static void main(String[] args) {

        // Syntax ==> ArrayList<DataType> listName = new ArrayList<DataType>();
        //                      Mandatory                           optional

        ArrayList<Integer> scores = new ArrayList<Integer>();   // size : 0
                                                // add five elements, size : 5
                                                // remove two elements, size : 3

        scores.add(10); // autoboxing   size : 1
        scores.add(20); // autoboxing   size : 2
        scores.add(25); // autoboxing   size : 3

        System.out.println( scores );


        Integer a1 = scores.get(2); // none

        int a2 = scores.get(2);     // unboxing

        double a3 = scores.get(2);  // unboxing

        System.out.println( a1 +"-" + a2 + "-" + a3);


    }
}
