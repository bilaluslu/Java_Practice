package day02_Variables;

public class VariablesPractise {
    public static void main(String[] args) {

        /* salary, federal tax rate, state tax, loan, ssn */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        // salary after tax = salary(1-sum of taxes)

        double sumTaxes = federalTax + stateTax;

        double salaryAfterTax = salary * (1-sumTaxes);

        System.out.println(salaryAfterTax);
        System.out.println("===========================");
        //-------------------------------------------------//

        //area of the circle = r * r * pi

        double r = 5.5;
        double pi = 3.14;
        double area = r * r * pi;
        System.out.println(area);
        System.out.println("============================");
        //-----------------------------------------------------//

        // wrire a program that can covert kg to lb

        double kg =60;
        double pound = kg / 0.454;
        System.out.println(pound);
        System.out.println("=============================");
                //-------------------------------------------------//

        // write currency exchange

        double lira = 1000;
        double liraInDollar = lira * 6.15;
        System.out.println(liraInDollar);
        System.out.println("==============================");
                //-------------------------------------------------//

        // convert gallon to liter

        double liter = 10000;
        double gallons = liter/3.7;
        System.out.println(gallons);

    }
}
