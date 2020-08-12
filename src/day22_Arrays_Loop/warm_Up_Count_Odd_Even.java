package day22_Arrays_Loop;

public class warm_Up_Count_Odd_Even {
    public static void main(String[] args) {

/*
write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */

        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };

        int countOddNumbers = 0;
        int countEvenNumber = 0;

        for ( int each : arr ) {

            /*
            if ( each % 2 != 0 ) {
                countOddNumbers++;
            } else {
                countEvenNumber++;
            }
            */

            // another solution

            if ( each % 2 == 0 ) {
                countEvenNumber++;
                continue;
            }

            countOddNumbers++;

        }
        System.out.println( "Even Numbers: " + countEvenNumber );
        System.out.println( "Odd Numbers: " + countOddNumbers );


















    }
}
