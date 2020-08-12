package Repl_It;

import java.util.Scanner;

public class Loop_Draw_Rect_Outline {
    public static void main(String[] args) {
        /*you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rectangle row is "x  x"
for example:
n=3
xxx
x  x
x  x
x  x
xxx
*/

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("***");

        for ( int i = 1 ; i <= n ; i++) {
            System.out.println("*" + " *");
        }
        System.out.println("***");





















    }
}
