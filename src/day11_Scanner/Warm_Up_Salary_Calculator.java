package day11_Scanner;

import java.util.Scanner;

public class Warm_Up_Salary_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary:");
        double salary = input.nextDouble();
        System.out.println("Enter State Tax Rate:");        //0.0436
        double stateTax = input.nextDouble();
        System.out.println("Enter Federal Tax Rate:");      //0.0845
        double federalTax = input.nextDouble();

        // total tax = (stateTax + federalTax) * salary
        double totalTax = (stateTax + federalTax) * salary ;

        // salaryAfterTax = salary - totalTax
        double salaryAfterTax = salary - totalTax;

        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Your Salary After Tax: $" + salaryAfterTax);






















    }
}
