package day14_StringClass;

import java.util.Scanner;

class Web_Address_Practice {
    public static void main(String[] args) {
        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter web site");
        String webSite = input.next();

        webSite = webSite.toLowerCase();
        boolean validEnding = webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gov");

        if (webSite.startsWith("www.") && validEnding) {
            System.out.println("Valid Address");
        } else {
            System.out.println("Invalid Address");
        }














    }
}
