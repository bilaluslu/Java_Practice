package day16_For_Loop;

public class Continue_Practice {
    public static void main(String[] args) {

        // skip Y, H, J, D

        for ( char ch = 'Z' ; ch >= 'A' ; ch--) {

            if ( ch == 'Y' || ch == 'H' || ch == 'J' || ch == 'D') {
                continue;
            }


            System.out.print(ch + " ");
        }

        System.out.println("\n=======================");

        for ( int i = 0 ; i <= 100 ; i++) {

            if ( i % 3 == 0 && i % 5 == 0 && i % 4 == 0 ) {

                continue;

            }

            System.out.print(i + " ");
        }






















    }
}
