package day09_Nested_If_Ternary;

import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {

        /*
        Nested If: if the condition can be evaluate to multiple scenario

            if we have precondition
            if(pre-condition){
                    statementA
                if(Condition1){
                    statementB
                }
            }
        statementA: only if precondition is true
        only statementA: if precondition is true, condition1 is false
        statementB: if precondition is tre, and condition1 is true
         */


        int age =19;
        boolean USCitizen = true;

        if (USCitizen) {
            if (age >17){
                System.out.println("eligible to vote");
            }else {
                System.out.println("NOT eligible to vote");
            }
        } else {
            System.out.println("only US citizen can vote");
        }

        System.out.println("\n=============================\n");

        int score = 2;
        String grade ="";

        if (score >= 0 && score <= 100) {

            if (score >= 90){
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {    // score < 0 or score > 100
            grade = "Invalid";
        }
        System.out.println(grade);

        System.out.println("\n===================\n");

        int score2 = 75;
        String grade2 = "";

        if(score2>=0 && score2 <= 100){

            grade2 = (score2 >= 90 ) ? "A" :(score2>=80)? "B" :(score2 >= 70) ? "C"
                    :(score2 >= 60) ? "D" : "F";

        }else{
            grade2 = "Invalid";
        }


        System.out.println(grade2);















    }
}
