package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,3,3,6,7,8,1,3,3,3,3,3) );
        //remove 1 ,3 ,5 ,8

        /*
        Integer a = 1;
        list.remove(a); // removes first 1
        list.remove(a); // removes second 1
        // remove operation only remove by one by

        System.out.println(list);

        list.removeAll( Arrays.asList(3) );

        System.out.println( list ); // removed all 3 in arraylist
 */

        Integer[] arr = {3,1,5,8};  // this is another way to remove elements from arraylist
        list.removeAll( Arrays.asList( arr ) );
        System.out.println( list );

        System.out.println("==========================================");

        // remove all names Ahmed
        String[] names = {"Ahmed","John","Aaron","Ahmed","Daniel"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println( nameList);

        nameList.removeAll( Arrays.asList("Ahmed") );
        System.out.println( nameList );











    }
}
