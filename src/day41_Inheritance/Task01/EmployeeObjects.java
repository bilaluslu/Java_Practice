package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1 = new Developer(150000,"Hale",12345678,"Software Developer",'F');
        System.out.println( dev1 );

        dev1.fixingBug();
        dev1.coding();

        Tester tester1 = new Tester("Bilal",130000,87654321,"SDET",'M');
        System.out.println( tester1 );

        tester1.testing();
        tester1.reporting();

        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst(110000,"Ali",45678912,'M');
        System.out.println( businessAnalyst1 );

        businessAnalyst1.writingReq();
        businessAnalyst1.gathering();


    }
}
