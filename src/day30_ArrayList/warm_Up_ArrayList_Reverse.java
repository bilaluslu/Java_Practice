package day30_ArrayList;

import java.util.ArrayList;

public class warm_Up_ArrayList_Reverse {
/*
2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: {5, 4, 3, 2, 1}
 */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 1 ; i < 6 ; i++ ) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();
        for ( int j = list.size()-1 ; j >= 0 ; j-- ) {
            int eachNum = list.get(j);  // unboxing
            reversedList.add(eachNum);

        }
        System.out.println( reversedList );


    }


}
