package day18_Nested_Loop;

public class nested_Loop {
    public static void main(String[] args) {

        for ( int i = 1 ; i <= 3 ; i++ ) {

            for ( int j = 1 ; j <= 5 ; j++ ) {

                System.out.print(j + " ");      //1 2 3 4 5
                                                //1 2 3 4 5
                                                //1 2 3 4 5
            }
            System.out.println();
        }

        System.out.println("=============================================");

        for ( int j = 1 ; j <= 7 ; j++ ) {

            int i = 1;
            while ( i <= 5 ) {

                System.out.print("*");
                i++;

            }

            System.out.println();
        }






















    }
}
