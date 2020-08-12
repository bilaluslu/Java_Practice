package day09_Nested_If_Ternary;

public class Loan_Nested_If_Practice {
    public static void main(String[] args) {

        double salary = 20000;
        byte workHistory = 1;

        if (salary >= 30000) {
            if (workHistory >= 4) {
                System.out.println("You are qualified for loan");
            } else {
                System.out.println("You must have been on job at 2 years");
            }
        } else {
            System.out.println("You must earn at least $30000");
        }

















    }
}
