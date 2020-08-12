package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {

/*
        double hourlySalary = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;
        byte totalWeeksInAYear = 52;

        double salary = (hourlySalary*weeklyHours*totalWeeksInAYear);   //salary before tax
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double taxAfter = (stateTax + federalTax);
        double lastSalary = (salary-taxAfter);

        System.out.println("Your Salary Is: $" + salary);
        System.out.println("Your State Tax: $" + stateTax);
        System.out.println("Your Federal Tax $: " + federalTax);
        System.out.println("Your Total Tax: $" + taxAfter);
        System.out.println("Your Salary After Taxes: $" + lastSalary);
*/

        double hourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;

        // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks ;
        //salary before tax

        // sateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax +federalTax
        double totalTax = stateTax + federalTax;

        //salaryAfterTax = salary - stateTax -federalTax ;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your Salary is: $" + salary );  // concatenation
        System.out.println("State Tax is: $" + stateTax );  // concatenation
        System.out.println("Federal Tax is: $"+ federalTax);
        System.out.println("Total Tax is: $" +  totalTax  );
        System.out.println("Salary After Tax is: $"+ salaryAfterTax );

    }
}
