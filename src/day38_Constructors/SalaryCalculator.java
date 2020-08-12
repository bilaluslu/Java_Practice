package day38_Constructors;
/*
Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public  SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }
    public double salary(){ // annual income
        return hourlyRate * weeklyHours * 48;
    }
    public double stateTax(){ //total tax paid to the state
        return salary() * stateTaxRate;
    }
    public double federalTax(){ //total tax paid to the federal
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){ // salary after taxes
        return salary() - stateTax() - federalTax();
    }
    public String toString(){
        return "Hourly Rate: $" + hourlyRate + ", Weekly Hours: " + weeklyHours
                + ", Gross Salary: $" + salary() + ", State Tax: $" + stateTax()
                + ", Federal Tax: $"+ federalTax() + ", Net Salary: $" + salaryAfterTax();
    }

}
