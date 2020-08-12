package homePractice;

import java.util.Arrays;

public class Arrays_Ascending_Order {
    public static void main(String[] args) {

        int[] nums = {1 , 2, 3, 4, 5, 23 ,6 ,2,32} ;
        String str = Arrays.toString(nums);
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        String[] names = {"ali" ,"veli" ,"bilal"} ;
        System.out.println(Arrays.toString(names));

        System.out.println("=================");

        int [] arr = {1,4,3,5,2,4,6,4,2,1,3} ;
        Arrays.sort(arr);
        int [] arr2 = new int [arr.length];
        int z= 0;
        for ( int i = arr.length-1 ; i >= 0 ; i--) {

             arr2[z] = arr[i];
            z++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));





    }
}
