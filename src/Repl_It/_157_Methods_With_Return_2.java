package Repl_It;

import java.util.Scanner;

public class _157_Methods_With_Return_2 {
/*
max function gets two ints, x and y.
x is the test case, y is what we test against.
if  x is bigger then y return y
in any other case return x.
for example:
max(1,10)
returns 1
max(11,5)
returns 5
*/

    public static int maxNumber(int x, int y) {

            if ( x > y ) {
                return y;
            } else {
                return x;
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int result = maxNumber(x,y);
        System.out.println(result);
    }









}
