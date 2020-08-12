package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class list_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add( "Milk" );             // size : 1
        shoppingList.add( "Coffee" );           // size : 2
        shoppingList.add( "Bread" );            // size : 3
        shoppingList.add( "Toilet Paper" );     // size : 4

        System.out.println( shoppingList );
        // we can print seperate to get all elements
        System.out.println( shoppingList.get(0) );
        System.out.println( shoppingList.get(1) );
        System.out.println( shoppingList.get(2) );
        System.out.println( shoppingList.get(3) );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // or we can do for to get all elements
        for ( int i = 0 ; i < shoppingList.size() ; i++ ) {
            System.out.println( shoppingList.get(i) );
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //or we can do with for each to get all elements
        for ( String each : shoppingList) {
            System.out.println(  each  );
        }


        // size();

        int size = shoppingList.size();
        System.out.println(  size  );   // returns 4


    }
}
