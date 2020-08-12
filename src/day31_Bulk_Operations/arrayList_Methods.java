package day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        boolean r1 = list1.contains("C");    //true
        System.out.println(r1);
        boolean r2 = list1.contains("F");    //false
        System.out.println(r2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        boolean r3 = list1.equals( list2);   //false because order of elements are different
        System.out.println(r3);


        // Arrays.equal(arr1,arr2)


        int[] arr1 = {1,2,3};
        int[] arr2 = {2,1,3};

        boolean r4 = Arrays.equals(arr1,arr2);  //false, to make true we can first sort both arrays
                                                // and it will give us true
        System.out.println(r4);

        System.out.println("======================================================");

        // write arraylist the descending order as arraylist

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(30);
        list3.add(20);
        list3.add(100);

        Collections.sort(list3);
        System.out.println(list3);  // returns sorted version of list3

        ArrayList<Integer> reverseList = new ArrayList<>();

        for ( int i = list3.size()-1 ; i >=0 ; i-- ) {
            //System.out.print( list3.get(i) +" " ); //returns 100,30,20,10
            reverseList.add( list3.get(i) );
        }
        System.out.println( reverseList );  // returns [100, 30, 20, 10]

        System.out.println( list3.size() );     // return 4
        boolean r5 = list3.isEmpty();
        System.out.println(r5);     //false

        list3.clear();
        boolean r6 = list3.isEmpty();
        System.out.println(r6);     //true







    }
}
