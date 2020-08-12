package day16_For_Loop;

public class warmUp_English_Alphabet {
    public static void main(String[] args) {
        //  Write a program that will print out all letters in English alphabet in ascending order
        // Write a program that will print out all letters in English alphabet in descedning order



        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n===================================================");

        for ( char ch = 'Z' ; ch >= 'A' ; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println("\n===================================================");

        for (char ch = 'a'; ch <= 'z' ; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n===================================================");

        for ( char ch = 'z' ; ch >= 'a' ; ch--) {
            System.out.print(ch + " ");
        }























    }
}
