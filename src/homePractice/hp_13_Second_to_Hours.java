package homePractice;

import java.util.Scanner;

public class hp_13_Second_to_Hours {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int hours = inputSeconds/3600;
        int minutes = (inputSeconds/60)%60;
        int seconds = inputSeconds%60;

        System.out.println( hours + " hours " + minutes + " minutes, " + "and seconds " + seconds);









    }
}
