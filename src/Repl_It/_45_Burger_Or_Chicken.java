package Repl_It;

import java.util.Scanner;

public class _45_Burger_Or_Chicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here

        if ( in.equals("burger") || in.equals("chicken")) {
            float price1 = 10f;
            System.out.println(price1);
        }
        if ( in.equals("soda")) {
            float price2 = 2f;
            System.out.println(price2);
        }


    }
}
