package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    /*
    create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */
    public static void main(String[] args) {

        Item item1 = new Item("Toilet Paper",2,1);
        System.out.println( item1.calcCost() ); // returns only cost
        System.out.println( item1 );    // returns every info
        Item item2 = new Item("Banana",0.5,8);
        Item item3 = new Item("Apple",0.8,10);
        Item item4 = new Item("Orange",0.6,12);
        Item item5 = new Item("Egg",0.1,30);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll( Arrays.asList( item1 , item2 , item3 , item4 , item5 ) );
/*
        //solution 1
        double totalCost = 0;
        for ( Item each : shoppingList ) { //each: item1,item2,item3,item4,item5
            totalCost += each.calcCost();
        }
        System.out.println( "Total: " + totalCost );
*/
        //solution 2
        double totalCost = 0;
        for ( int i = 0 ; i < shoppingList.size() ; i++ ) {
            totalCost += shoppingList.get(i).calcCost();
        }
        System.out.println( "Total: " + totalCost );


    }
}
