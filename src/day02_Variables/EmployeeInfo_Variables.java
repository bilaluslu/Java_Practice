package day02_Variables;

public class EmployeeInfo_Variables {
    public static void main(String[] args) {

        //company name, name; emplayee id, job title, salary, ssn

        String employeeName = "Bilal USLU";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        int ssn = 123456789;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Social Security Number: " + ssn);

        System.out.println("\n\n");

        System.out.println("Employee Name: " + employeeName +
                "\nCompany Name: " + companyName+
                "\nEmployee ID " + employeeId +
                "\nJob Title: " + jobTitle +
                "\nSalary: " + salary +
                "\nSocial Security Number: " + ssn);

        String first= "Bilal";
        String last = "USLU";
        System.out.println("Full Name " + first + " " + last);


    }
}
