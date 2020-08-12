package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator Zareen = new SalaryCalculator(75,40,0.0825,0.20);
        System.out.println(  Zareen  );

        SalaryCalculator Dana = new SalaryCalculator(60,40,0.07,0.16);
        System.out.println(  Dana  );

    }
}
