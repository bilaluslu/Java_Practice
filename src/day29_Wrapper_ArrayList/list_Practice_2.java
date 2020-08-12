package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class list_Practice_2 {
    public static void main(String[] args) {
/*
 1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
 */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int maximum1 = Integer.MIN_VALUE;

        for ( int i = 0 ; i< list.size() ; i++ ) {
            if ( list.get(i) > maximum1 ) {
                maximum1= list.get(i);
            }
        }
        System.out.println(  maximum1  );

        // another way with for each loop
        int maks2 = Integer.MIN_VALUE;
        for ( Integer each : list ) {
            if ( each > maks2 ) {
                maks2 = each;
            }
        }
        System.out.println(  maks2  );

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(-6);
        list2.add(9);
        int maximum3 = max(list2);
        System.out.println( maximum3 );



    }

    public static int max( ArrayList<Integer> list ) {
        int maximum = Integer.MIN_VALUE;
        for ( int i = 0 ; i < list.size() ; i++ ) {
            if ( list.get(i) > maximum ) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }


}
