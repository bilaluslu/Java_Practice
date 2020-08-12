package day21_Multi_Dimensional_Arrays;

public class warm_Up_Average_Number {
    public static void main(String[] args) {
/*write a program that can return the average number from an array of integers
			ex:
				[10, 15, 5, 6]
				average: 9
 */
        int[] arr = { 10 , 20 , 30 , 40 , 50 };
        // average : sum of all numbers / length

        int length = arr.length;
        int sum = 0;

        for ( int i = 0 ; i < length ; i++ ) {
            int eachNum = arr[i];
            sum += eachNum;
        }
        //System.out.println(sum);

        double average = sum/length;

        System.out.println(average);



    }
}
