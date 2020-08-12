package Repl_It;

import java.util.Arrays;

public class atest_Combine_Name {
/*
This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}
returns a new String array with {"bob jones", "joe smith"}
 */
    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] arr = new String[first_names.length];
        for ( int i = 0 ; i < first_names.length ; i++ ) {
            arr[i] = first_names[i] +" "+ last_names[i];
        }
        return arr;

    }

    public static void main(String[] args) {

        String[] arr1 = combineNames(new String[]{"bob", "joe"}, new String[]{"jones", "smith"});
        System.out.println(Arrays.toString(arr1));

    }

}
