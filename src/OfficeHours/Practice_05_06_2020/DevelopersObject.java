package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {

        Developer developer1 = new Developer();

        developer1.setInfo("Mehmet", "Senior Developer",160000,18121993);
        System.out.println( developer1 );

        developer1.coding();    // return Mehmet is coding

        Developer developer2 = new Developer();

        developer2.setInfo("Leon", "Senior Developer",180000,18121993);
        System.out.println( developer2 );

        developer2.coding();

        developer2.fixingBug();

        System.out.println("==================================================");

        Developer[] arr = {developer1,developer2};
        System.out.println( arr[0].name );

        for ( Developer each : arr ) {
            System.out.println(each.name+" "+each.salary);
        }
        System.out.println("====================================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr));
        //developers.addAll(Arrays.asList(developer1,developer2));

        System.out.println( developers.size() );

        for ( int i = 0 ; i < developers.size() ; i++ ) {
            System.out.println( developers.get(i) );    // returns all info
            System.out.println( developers.get(i).name );   // returns only name
        }







    }
}
