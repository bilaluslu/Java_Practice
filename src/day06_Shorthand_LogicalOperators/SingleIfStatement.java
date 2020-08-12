package day06_Shorthand_LogicalOperators;

import java.lang.ref.SoftReference;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWater= true;
        if(coldWater){
            System.out.println("wear your hat");
            System.out.println("wear your jacket");
        }

        boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("\nbuy more toilet paper");
            System.out.println("buy more water");
            System.out.println("stay at home");
            System.out.println("do more java coding\n");
        }


        int a =100;
        boolean evenNumber = a % 2 == 0;
        boolean oddNumber = a % 2 != 0;
        if(evenNumber){
            System.out.println(a + " is even number");
        }

        if(oddNumber){
            System.out.println(a + " is odd number");
        }



    }
}
