package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
/*
        // add 30 , 20 ,40 ,50, 45, 35 ,200
        list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);             */

        //list1.addAll(Arrays.asList( 30 , 20 , 40 , 50 , 45 , 35 , 200 ) );
        // int[] arr1 = {30 , 20 , 40 , 50 , 45 , 35 , 200 };  arrayList does not support primitive

        Integer[] arr1 = {30 , 20 , 40 , 50 , 45 , 35 , 200 };
        list1.addAll( Arrays.asList( arr1 ) );
        System.out.println( list1 );
        System.out.println("==================================");

        String[] names = { "Murtaza", "Muhtar", "Muhesong", "Sada", "Rustem" };

        //name[5] = "Osman" we cannot add to array new element

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll( Arrays.asList( names ) );
                            //collectionType
        nameList.add("Osman");
        nameList.remove("Muhtar");
        System.out.println( nameList );

        System.out.println("====================================");

        // shorter way to add elements to arrayList
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList = new ArrayList<>( Arrays.asList(numbers) );
// if array is primitive we CANNOT convert arraylist
// if array is NOT primitive we CAN convert arraylist

        System.out.println( numList );






    }
}
