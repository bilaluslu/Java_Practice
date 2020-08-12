package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Bilal = new EmployeeInfo();
        Bilal.setAddress("Georgia");
        Bilal.setSalary(120000.50);
        Bilal.setID(12345678);

        System.out.println(  Bilal.getAddress()  );
        System.out.println(  Bilal.companyName   );
        System.out.println(  Bilal.getSalary()   );
        System.out.println(  Bilal.getID()       );

    }
}
