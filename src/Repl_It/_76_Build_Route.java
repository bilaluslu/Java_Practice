package Repl_It;

import java.util.Scanner;

public class _76_Build_Route {
    public static void main(String[] args) {
        /*Write a program that will print out route instructions.
        Your program should take 2 parameters: start point and end point. Use left, right, up
        and down for navigation. Insert ">" between commands. If start point equals to end point -
        display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
Input: A
Input: D
Output: right > down > left: D found
str = Character.toString((char)i);
*/
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String route = "Aright > Bdown > Cleft > Dup > Aright > Bdown > C";
        String output="";
        //System.out.println(route.indexOf(start.charAt(0)));
        //System.out.println(route.indexOf(end.charAt(0)));


        //str.indexOf("is", str.indexOf("is") + 1);
        if (start.charAt(0) < end.charAt(0)) {
            for (int i = route.indexOf(start.charAt(0)); i <= route.indexOf(end.charAt(0)); i++) {
                output += route.charAt(i);
            }

            output = output.replace("A", "");
            output = output.replace("B", "");
            output = output.replace("C", "");
            output = output.replace("D", "");

            output += ": " + end.charAt(0) + " found";
            output = output.substring(0, output.indexOf(end.charAt(0)) - 5) + output.substring(output.indexOf(end.charAt(0)) - 2);

            System.out.println(output);
        }
        else if (start.charAt(0) > end.charAt(0)){
            for (int i = route.indexOf(start.charAt(0)); i <= route.indexOf(end.charAt(0), route.indexOf(end.charAt(0)) + 1); i++) {
                output += route.charAt(i);
            }

            output = output.replace("A", "");
            output = output.replace("B", "");
            output = output.replace("C", "");
            output = output.replace("D", "");

            output += ": " + end.charAt(0) + " found";

            //output = output.replace(output.substring(output.indexOf(end.charAt(0))-4, output.indexOf(end.charAt(0))-1), "");
            output = output.substring(0, output.indexOf(end.charAt(0)) - 5) + output.substring(output.indexOf(end.charAt(0)) - 2);
            System.out.println(output);
        }
        else{
            System.out.println(start + " found");
        }
















        /*
        int diff = Math.abs(end.charAt(0) - start.charAt(0));

       if (start.equalsIgnoreCase(end)){
           System.out.println(end + " found");
       } else {
           if (start.equals("A") && diff == 1) {
               System.out.println("right: " + end + " found");
           } else if (start.equals("A") && diff == 2) {
               System.out.println("right > down: " + end + " found");
           } else if (start.equals("A") && diff == 3) {
               System.out.println("right > down > left: " + end + " found");
           } else if (start.equals("B") && diff == 1) {
               System.out.println("down: " + end + " found");
           } else if (start.equals("B") && diff == 2) {
               System.out.println("down > left: " + end + " found");
           } else if (start.equals("B") && diff == 3) {
               System.out.println("down > left > up: " + end + " found");
           } else if (start.equals("C") && diff == 1) {
               System.out.println("left: " + end + " found");
           } else if (start.equals("C") && diff == 2) {
               System.out.println("left > up: " + end + " found");
           } else if (start.equals("C") && diff == 3) {
               System.out.println("left > up > right: " + end + " found");
           } else if (start.equals("D") && diff == 1) {
               System.out.println("up: " + end + " found");
           } else if (start.equals("D") && diff == 2) {
               System.out.println("up > right: " + end + " found");
           } else if (start.equals("D") && diff == 3) {
               System.out.println("up > right > down: " + end + " found");
           }
       }
*/






    }
}
