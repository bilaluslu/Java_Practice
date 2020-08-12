package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;

public class practice1_Array {
    public static void main(String[] args){
        System.out.println(  sum( new int[]{1, 2, 3} ) );


    }

    public static int sum (  int[] arr  ){

        int sum = 0;

        for( int i = 0 ; i < arr.length ; i++ ){
            sum += arr[i];
        }
        return sum;
    }

    public static int sum (  ArrayList<Integer> list  ){

        int sum = 0;

        for( int i = 0 ; i < list.size() ; i++ ){
            sum += list.get(i);
        }
        return sum;
    }

}
