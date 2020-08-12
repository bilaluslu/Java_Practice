package day25_Methods_Recap;

public class return_Methods {
//  a , b

    public static void main(String[] args) {

        max(10,9);

    }


        public static int max ( int a ,int b ) {
            int max = 0;
            if ( a>= b ) {
                max = a;
            } else {
                max = b;
            }
            return max;
        }

        public static int max2 ( int a , int b ) {
            if ( a >= b ) {
                return a;
            } else {
                return b;
            }

        }














}
