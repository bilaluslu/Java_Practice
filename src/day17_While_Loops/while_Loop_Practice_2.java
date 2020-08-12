package day17_While_Loops;

public class while_Loop_Practice_2 {
    public static void main(String[] args) {



        for ( int i = 0 ; i <= 10 ; i++) {
            if ( i % 2 == 0 ) {
                System.out.println("with for: " + i);
            }
        }

        System.out.println("\n==================\n");

        int sum = 0;
        int i = 0;
        while ( i <= 10 ) {
            if (i % 2 == 0) {
                sum += 1;
            }
            i++;
        }
        System.out.println("with while: " + sum);

















    }
}
