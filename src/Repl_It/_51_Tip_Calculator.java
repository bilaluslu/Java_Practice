package Repl_It;

import java.util.Scanner;

public class _51_Tip_Calculator {
    public static void main(String[] args) {
/*        Write your code inside the method.
        Use the values given as method parameters.
                Assign final values.
        Then user should select service quality that will correspond to tip percent.
        Poor = 5%
                Fair = 10%
                Good = 15%
                Great = 20%
                Excellent = 25%
                The program should display the following information based on the user input:
        Split or No split
        Number of people entered: &&&&
        Service Quality:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:
        Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String split = input.next();

        System.out.println("Number of people:");
        int people = input.nextInt();
        System.out.println("Check amount:");
        double billAmount = input.nextDouble();
        System.out.println("Service Quality:");
        String quality = input.next();


        String head =(people==1)?"&":(people==2)?"&&":(people==3)?"&&&":(people==4)?"&&&&":"&&&&&";
        double percent = (quality.equalsIgnoreCase("poor")) ? 0.05 :
                (quality.equalsIgnoreCase("fair") ) ? 0.1 :
                        (quality.equalsIgnoreCase("good") ) ? 0.15 :
                                (quality.equalsIgnoreCase("great") ) ? 0.2 :
                                        (quality.equalsIgnoreCase("excellent") )? 0.25 : 0;

        double totalTip = (billAmount)*percent;
        double totalToPay = (billAmount+totalTip);
        double totalPerPerson = totalToPay/people;
        double tipPerPerson = totalTip/people;

        if (split.equalsIgnoreCase("YES")) {

            System.out.println("Number of people entered: " + head);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " +totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);

        }

        else if ( split.equalsIgnoreCase("no")) {

            System.out.println("Number of people entered: " + head);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " +totalTip);
        }













    }
}
