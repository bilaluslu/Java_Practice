package day21_Multi_Dimensional_Arrays;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Arrays;

public class zoo {
    public static void main(String[] args) {

        String[] wildAnimals = { "Tiger" , "Lion" , "Monkey" , "Turtle" , "Crocodile" };
                            //      0         1         2          3            4
        String[] birds = { "Eagle" , "Ducks" , "Peacock" , "Chicken" };
                        //    0         1          2           3

        String[][] zoo = { wildAnimals , birds };
        //                      0           1

        String kfc = zoo[1][3];  // chicken
        System.out.println(kfc);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for ( String each : zoo[1] ) {

            if ( each.equals("Chicken") ){  // for not to print Chicken
                continue;
            }
            System.out.println(each);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for ( String each1 : zoo[0] ) {

            System.out.println(each1);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");






















    }
}
