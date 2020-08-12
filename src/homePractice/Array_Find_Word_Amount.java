package homePractice;

import java.util.Arrays;

public class Array_Find_Word_Amount {
    public static void main(String[] args) {

        String str = "I love Java and Java is fun, Java is life";   // we have 3 Java
                    //I love   |  and   |  is fun,   |  is life
        String [] array = str.split("Java");

        System.out.println(Arrays.toString(array)); // gives us array without Java
        System.out.println(array.length-1);     // gives us amount of Java
                                            // -1 because it splits 4 means we have 3 Java

        System.out.println("===================================");

        String str2 = "Bilal_Uslu_Engineer";
        String[] array2 = str2.split("_");

        System.out.println(Arrays.toString(array2));





        String str3 = "Java";
        char[] ch = str3.toCharArray();
        System.out.println(Arrays.toString(ch));




    }
}
