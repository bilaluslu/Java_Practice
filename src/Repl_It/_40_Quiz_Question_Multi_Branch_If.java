package Repl_It;

import java.util.Scanner;

public class _40_Quiz_Question_Multi_Branch_If {
    public static void main(String[] args) {

/*in the given program you have a quiz question and
a scanner to catch user input which will be stored on string a.
after the user inputs an answer (a, b or c)
 we need to check if its the correct, wrong, valid answer.
 */
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.nextLine();

        if ( answer.equals("a")) {
            System.out.println(answer + " is wrong");
        } else if ( answer.equals("b")) {
            System.out.println(answer + " is correct");
        } else if (answer.equals("c")){
            System.out.println(answer + " is wrong");
        } else {
            System.out.println(answer + " is not a valid answer");
        }




    }
}
