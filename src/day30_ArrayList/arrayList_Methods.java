package day30_ArrayList;

import java.util.ArrayList;

public class arrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);   // index 0
        list1.add(7);   // index 1
        list1.add(8);   // index 2

        //list1.add(6);   // ==> {5,7,8,6}
        list1.add(1,6); // it will add index 1 ==> {5,6,7,8}

        //list1.add(7,10);    // index out of bound

        System.out.println( list1 );

        list1.set(3,9);

        System.out.println("After set methods: " + list1);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");   // (A , C , B)
        list2.add(1,"D");   // (A , D , C , B)

        list2.set(3,"F");
        list2.set(2,"E");
        System.out.println(list2);  // {A,D,E,F}

        System.out.println("=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=`=");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);   // index 0
        list3.add(2);   // index 1
        list3.add(3);   // index 2
        list3.add(4);   // index 3



    }
}
