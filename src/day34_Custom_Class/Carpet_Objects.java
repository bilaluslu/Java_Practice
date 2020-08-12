package day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet_Objects {
    public static void main(String[] args) {

        Carpet[] carpets = { new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet() };

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35, 45, 35, true);

        //System.out.println( carpets[3] ); //return carpet[3] info

        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for ( Carpet eachCarpet : carpets ) {
            if ( eachCarpet.isPersian ) {
                persianCarpets.add( eachCarpet );
            }
        }
        System.out.println("There are " + persianCarpets.size() + " persian carpet");   // return how many persian carpet we have
        System.out.println( persianCarpets.get(0).calcCost() ); // returns total price of first carpet

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        regularCarpets.removeAll( persianCarpets );

        System.out.println("==========================");

        System.out.println( "There are " + regularCarpets.size() + " regular carpets" );    // return how many regular carpet we have

        for ( int i = 0 ; i < regularCarpets.size() ; i++ ) {
            System.out.println(regularCarpets.get(i).calcCost()); // returns total price of first carpet
        }




    }
}
