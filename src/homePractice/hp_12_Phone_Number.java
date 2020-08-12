package homePractice;

import java.util.Scanner;

public class hp_12_Phone_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Area Code");
        int areaCode = input.nextInt();
        System.out.println("Local Number");
        int localNumber = input.nextInt();

        String phoneNumber = "(" +areaCode+ ")" + ("-") + localNumber;

        System.out.println(phoneNumber);




    }
}
