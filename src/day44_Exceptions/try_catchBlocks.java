package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {

    public static void main(String[] args) {

        System.out.println("test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try{
            System.out.println( list.get(10));
        } catch (IndexOutOfBoundsException e){  // e represent variable
            // IndexOutOfBoundsException represents which exception we are trying to handle
            // and also we can use parent class ==> RuntimeException
            // and also we can use grandparent class ==> Exception

            System.out.println("something went wrong");
        }


        System.out.println("Test completed");
    }

}
