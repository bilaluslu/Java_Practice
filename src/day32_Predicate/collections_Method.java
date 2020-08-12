package day32_Predicate;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class collections_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
        1. write a program that can return the second max number from ArrayList
        ex: {1,2,3,4,5,6,7,8,8}
        output : 7
        2. write a program that can return the second min number from ArrayList
        ex: {1,1,2,3,4,5,6,7,8}
        output : 2
         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        Integer maxNum = Collections.max(numbers);  //4

        numbers.removeAll( Arrays.asList(maxNum) );

        System.out.println(numbers);


        int secondMax= Collections.max(numbers) ;

        System.out.println(secondMax);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNum = Collections.min(list2);    //1

        list2.removeAll( Arrays.asList( minNum) );  //removes all the min number
        System.out.println(list2);

        int secondMin = Collections.min( list2);
        System.out.println(secondMin);

        System.out.println("===================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5)); // {1,2,3,4,5} ==> {5,2,3,4,1} we want to switch 1 and 5

        System.out.println( "before list3 ==> " + list3);
        Collections.swap(list3 , 0 , 4);
        System.out.println( "after list3  ==> " + list3 );

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Collections.replaceAll( listName , oldValue , newValue );

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer" , "Omer" , "Mary" , "Sha" , "Fatih" , "Omer"));

        /*
        names.set(0 , "Irina"); // replace first Omer to Irina
        names.set(1 , "Irina"); // replace seconf Omer to Irina
        names.set(5 , "Irina"); // replace last Omer to Irina
        System.out.println( names );
         */

        Collections.replaceAll( names , "Omer" , "Irina");
        System.out.println(names);







    }
}
