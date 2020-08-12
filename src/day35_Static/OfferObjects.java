package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA","BOA",100000,true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("KY","Capital One",120000,false);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("MD","Chase",95000,true);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea","Google",115000,true);
        System.out.println(offer4);

        Offer[] offers = {offer1,offer2,offer3,offer4}; // we will add to ArrayList
        String myLocation = "VA";   // my current location

        ArrayList<Offer> Accept = new ArrayList<>( Arrays.asList(offers) );
        Accept.removeIf( each -> each.salary < 100000 && each.isFullTime == false || each.location.equals(myLocation) );

        System.out.println( Accept.size() );

        for ( Offer eachOffer : Accept ) {
            System.out.println( eachOffer );
        }





    }
}
