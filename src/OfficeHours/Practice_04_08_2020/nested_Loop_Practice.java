package OfficeHours.Practice_04_08_2020;

public class nested_Loop_Practice {
    public static void main(String[] args) {

        for ( int i = 1 ; i <= 5 ; i++ ) {

            for (int j = 1; j <= i; j++) {


                System.out.print("* ");

            }
            System.out.println();

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();



        }
















    }
}
