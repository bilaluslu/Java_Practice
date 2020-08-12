package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name, String jobTitle, double salary, long employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

    }
    public String toString(){
        return "Name: " + name + ", Job Title: " + jobTitle
                + ", Salary: " + salary + ", EmployeeID: " + employeeID;
    }

    public void smokeTesting() {
        System.out.println(this.name +  " is doing smoking testing");   // we dont have to use 'this' for here
    }

    public void creatingTicket() {
        System.out.println(this.name + " is creating on Jira");
    }







}
